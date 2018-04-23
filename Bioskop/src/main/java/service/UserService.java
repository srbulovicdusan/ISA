package service;

import java.util.Collection;

import domain.User;

public interface UserService {
	Collection<User> getUsers();
	User addUser(User user);
	void deleteUser(User user);
	User getUser(String id);
}
