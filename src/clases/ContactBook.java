package clases;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class ContactBook extends ArrayList<Contact> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public Optional<Contact> getEmergency(){
		return this.getFirstThat(Contact::isEmergency);
	}
	
	
	private Optional<Contact> getFirstThat(Predicate<Contact> predicate){
		return this.stream().filter(predicate).findFirst();
	}
	
	public Optional<Contact> getFirstContactFromCity(String city){
		return getFirstThat(c -> c.getCity().equalsIgnoreCase(city));
	}

}
