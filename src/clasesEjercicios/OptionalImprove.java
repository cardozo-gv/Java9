package clasesEjercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

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
		contactBook.add(michael);
		contactBook.add(heinz);
		contactBook.add(roberto);
		contactBook.add(me);
		contactBook.add(martin);
		
		
		
		/*****************OPTIONAL AGREGA EL METODO ifPresentOrElse************************/
		Optional<Contact> emergencyCall = contactBook.getEmergency();
		
		// si getEmergency no tiene un contacto entonces llama al 911
		emergencyCall.ifPresentOrElse(contact -> contact.getPhoneNumber(), () -> System.out.println(911));

	}

}
