package POO3_1;

import java.util.Scanner;

public class USO_RELOJ {

	public static void main(String[] args) {
	    
        RELOJ CASIO = new RELOJ(null, null,true);
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce la alarma: ");
      CASIO.set_horalarma(scanner.nextLine());
 
      System.out.println("Introduce la hora: ");
      CASIO.set_horactual(scanner.nextLine());
      
      System.out.println();
      
      System.out.println("La alarma es "+ CASIO.get_horalarma());
      System.out.println("La hora es "+ CASIO.get_horactual());

        // Comprobar la alarma
      
        CASIO.comprobarAlarma();
        scanner.close();
    }
	

	}


