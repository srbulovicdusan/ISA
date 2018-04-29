package service;

import domain.User;

public interface LoginServiceInterface {

	User validation(String username, String password);
}
