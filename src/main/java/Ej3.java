/** 
@author Alejandro Jaime David Álvarez
*/
import java.util.*;


public class Ej3 {


	public static String terminaciones(String palabra) {

		String nombre = "Nombres historicos";
		int nombh = 0;
		String terminacion  = "";
		String terminacion2 = "";
		String terminacion3 = "";

		palabra = palabra.toLowerCase();
		terminacion2 = palabra.substring(palabra.length()-1, palabra.length());

		if(palabra.length() >= 2) {

			terminacion = palabra.substring(palabra.length()-2, palabra.length());

		}

		if(palabra.length() >= 3) {

			terminacion3 = palabra.substring(0, 3);

		} 

                if((terminacion.equals("us") || terminacion.equals("um"))) {
			nombre = "ROMANO";
			nombh++;
		}
		if(terminacion.equals("ix")) {
			nombre = "GALO";
			nombh++;
		}

		

		if(terminacion.equals("ic")) {
			nombre = "GODO";
			nombh++;
		}
                if(terminacion.equals("af")) {
			nombre = "NORMANDO";
			nombh++;
		}

		if(terminacion.equals("as")) {
			nombre = "GRIEGO";
			nombh++;
		}

	
		if((terminacion.equals("is") || terminacion.equals("os") || terminacion.equals("ax"))) {
			nombre = "BRETON";
			nombh++;
		}

		if(terminacion.equals("ez")) {
			nombre = "HISPANO";
			nombh++;
		}

		if(terminacion2.equals("a")) {
			nombre = "INDIO";
			nombh++;
		}

		if(terminacion3.equals("mac")){
			nombre = "PICTO";
			nombh++;
		}

		if(nombh > 1) {
			nombre = "MULATO";
		}
	
		return nombre;

	}



	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int casos = s.nextInt();
		s.nextLine();
		String frase;

		for(int i = 0; i < casos; i++) {

			frase = s.nextLine();		

			System.out.println(terminaciones(frase));

		}

	}

}
