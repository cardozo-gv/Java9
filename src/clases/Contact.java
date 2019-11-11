package clases;

import java.time.LocalDate;

public class Contact implements Comparable<Contact> {
	
	
	private String name;
	private String city;
	private String phoneNumber;
	private final LocalDate birth;
	private boolean emergency = false;
	
	

	public Contact(String name, String city, String phoneNumber, LocalDate birth, boolean emergency) {
		super();
		this.name = name;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
		this.emergency = emergency;
	}
	
	
	public Contact(String name, String city, String phoneNumber, LocalDate birth) {
		super();
		this.name = name;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	public String getPhoneNumber() {
		return phoneNumber;
	}





	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}





	public boolean isEmergency() {
		return emergency;
	}





	public void setEmergency(boolean emergency) {
		this.emergency = emergency;
	}





	public LocalDate getBirth() {
		return birth;
	}





	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
