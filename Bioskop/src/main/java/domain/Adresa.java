package domain;

import org.springframework.stereotype.Component;

@Component
public class Adresa {

	private String city;
	private String street;
	
	public Adresa() {
		
	}
	
	public Adresa(String city, String street) {
		super();
		this.city = city;
		this.street = street;
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
