package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.User;
import repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public Collection<User> getUsers() {
		Collection<User> users = repository.getUsers();
		return users;
	}

	@Override
	public User addUser(User user) {
		repository.addUser(user);
		return user;
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		repository.deleteUser(user);
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		User user = repository.getUser(id);
		return user;
	}

}
