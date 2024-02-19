package STATIC_4;

import java.util.Scanner;

public class VALIDADOR {
	public static boolean esNumero(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

}
	  public static boolean numeroEnRango(double numero, double minimo, double maximo) {
	        return numero >= minimo && numero <= maximo;
	        
}
	  public static void main(String[] args) {
		    Scanner scanner= new Scanner(System.in);
	        System.out.println("Inserte una cadena de numeros: ");
	        String num= scanner.nextLine();
	        if (esNumero(num)) {
	            System.out.println("La cadena es un número.");
	        } else {
	            System.out.println("La cadena no es un número.");
	        }
	        
	        System.out.println("Inserte el valor minimo del rango: ");
	        double minimo = scanner.nextDouble();
	        System.out.println("Inserte el valor maximo del rango: ");
	        double maximo = scanner.nextDouble();
	        System.out.println("Ahora inserte el numero que quieras: ");
	        double numeroEjemplo = scanner.nextDouble();
	        if (numeroEnRango(numeroEjemplo, minimo, maximo)) {
	            System.out.println("El número está en el rango especificado.");
	        } else {
	            System.out.println("El número no está en el rango especificado.");
	        }
	    }
}	  