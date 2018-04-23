package domain;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String username;
	private String password;
	private UserType userType;
	private Adresa address;
	private String email;
	private String firstName;
	private String lastName;
	
	
	public User() {
		super();
	}
	public User(String firstName,String lastName, String username, String password, UserType userType, Adresa address, String email) {
		super();
		this.firstName = firstName;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.address = address;
		this.email = email;
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public Adresa getAddress() {
		return address;
	}
	public void setAddress(Adresa address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
