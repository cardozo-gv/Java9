package clasesEjercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;
import java.util.function.Consumer;

import clases.Contact;
import clases.ContactBook;

public class OptionalImprove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*****************INICIALIZACION***********************************/
		Contact me = new Contact("Griselda","Buenos Aires","555 55 55 55",LocalDate.of(1979, Month.JANUARY, 4));
		Contact martin = new Contact("Martin","Mendoza","666 66 66 66",LocalDate.of(1963, Month.OCTOBER, 14));
		Contact roberto = new Contact("Roberto","Tucuman","888 55 88 55",LocalDate.of(1989, Month.MAY, 25));
		Contact heinz = new Contact("Heinz","Madrid","559 99 95 35",LocalDate.of(1977, Month.MAY, 28));
		Contact michael = new Contact("Michael","Santiago","444 45 44 55",LocalDate.of(1983, Month.JULY, 9),true);
		
		ContactBook contactBook = new ContactBook();
		//contactBook.add(michael);
		contactBook.add(heinz);
		contactBook.add(roberto);
		contactBook.add(me);
		contactBook.add(martin);
		
		
		
		/*****************OPTIONAL AGREGA EL METODO ifPresentOrElse************************/
		Optional<Contact> emergencyCall = contactBook.getEmergency();
		
		// si getEmergency no tiene un contacto entonces llama al 911
		//ifPresentOrElse(Consumer<Contact>, Runnable)
		emergencyCall.ifPresentOrElse(contact -> contact.getPhoneNumber(), () -> System.out.println(911));

		
		// El consumer y el runnable podriamos hacerlo como una clase anonima
		Consumer<Contact> consumer = new Consumer<Contact>() {

			@Override
			public void accept(Contact contact) {
			contact.getPhoneNumber();
				
			}
			
		};
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("llamar emergencia");
				
			}
			
		};
		
		//el ifPresentOrElse quedaria entonces
		emergencyCall.ifPresentOrElse(consumer, runnable);
		
		
		/*************************OPTIONAL CON METODO POR DEFAULT***************************************/
		
		Contact emergencies = new Contact("Emergencias","Argentina","911");
		
		//or(supplier)
		Optional<Contact> emercall =  contactBook.getEmergency().or(
				()-> Optional.of(emergencies)
				);
		
		String phone = emercall.get().getPhoneNumber();
		
		System.out.println(phone);
	}
	
	

}
