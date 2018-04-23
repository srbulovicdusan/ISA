package repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import domain.User;

@Repository
public class UserRepository implements UserInterface {
	private Collection<User> users = new ArrayList<User>();
	@Override
	public Collection<User> getUsers() {
		return users;	
	}
	@Override
	public User addUser(User user) {
		users.add(user);
		return user;
	}

	@Override
	public void deleteUser(User user) {
		users.remove(user);
		
	}
	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		for (User u : users){
			if (u.getUsername().equals(id)){
				return u;
			}
		}
		return null;
	}

}
