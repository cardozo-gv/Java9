package clasesEjercicios;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		//Creaciones de colecciones con el factory methods
		//retorna un ImmutableCollections. No permite modificaciones
		
		 List<String> divisibleBy4 = 
				List.of("CUATRO","OCHO","DOCE","DIECISEIS");
		
		
		//Recordemos que set no permite duplicados
		final Set<Integer> negative = 
				Set.of(-1,-2,-3);
		
		
		//clave-valor
		final  Map<String,Integer> numbers =
				Map.of(
					"UNO",1,
					"DOS",2,
					"TRES",3);
		
		
	
		negative.stream()
		.forEach(System.out::println);
		
		
		

	}

}
