package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.User;
import repository.UserRepository;

@Service
public class LoginService implements LoginServiceInterface {

	@Autowired
	UserRepository repository;
	
	@Override
	public User validation(String username, String password) {
		Collection<User> allUsers = repository.getUsers();
		for (User u : allUsers) {
			if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}

}
