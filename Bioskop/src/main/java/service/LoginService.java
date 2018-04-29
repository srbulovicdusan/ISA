package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.User;


@Service
public class LoginService implements LoginServiceInterface {

	
	@Autowired
	UserService userService;
	
	@Override
	public User validation(String username, String password) {
		User u = userService.getUser(username);
		if (u != null && u.getPassword().equals(password)) {
			return u;
		}
		else {
			return null;
		}
	}
}
