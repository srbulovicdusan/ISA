package domain;

import org.springframework.stereotype.Component;

@Component
public class Adresa {

	private String city;
	private String street;
	private String contactNumber;
	
	public Adresa() {
		
	}
	
	public Adresa(String city, String street, String contact) {
		super();
		this.city = city;
		this.street = street;
		this.contactNumber = contact;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
}
