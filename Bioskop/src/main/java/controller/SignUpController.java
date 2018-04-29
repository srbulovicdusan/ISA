package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.User;
import service.SignUpService;

@RestController
public class SignUpController {
	
	@Autowired
	private SignUpService signUpService;
	
	@RequestMapping(
			value="/api/signup",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public ResponseEntity<User> validation(@RequestBody User u) {
		
		
		User user = signUpService.validation(u);
		if (user != null) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} else {
			// tj trebalo bi found kao, posto vec postoji pa ne moze da se registruje
			return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
		}
		
	}
}
