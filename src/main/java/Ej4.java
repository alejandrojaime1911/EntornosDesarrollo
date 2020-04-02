  
import java.util.Scanner;

public class Ej4 {
*//@param cadena de palabras*/
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String linea;
		String[] palab = new String[20];
		String cad1 = "";
		String cad2 = "";
		boolean encadenar;


		while(s.hasNext()) {

			encadenar = false;

			linea = s.nextLine();

			palab = linea.split(" ");

			if(palab.length <= 1) {

				System.out.println("SI");

			} else {

				for(int i=0; i<palab.length-1; i++) {

						cad1 = palab[i].substring(palab[i].length() - 2);
						cad2 = palab[i+1].substring(0, 2);

						if(cad1.equals(cad2)) {
							encadenar= true;
						} else {
							encadenar = false;
							break;
						}

				}


				if(encadenar == true) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}


			}

			


		}

		s.close();

	}




}
