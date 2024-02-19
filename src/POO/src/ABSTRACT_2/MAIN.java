package ABSTRACT_2;

public class MAIN {

	public static void main(String[] args) {
		ANIMAL perro= new PERRO();
		ANIMAL gato= new GATO();
		
		System.out.println("PERRO: ");
		perro.hacersonido();
		perro.moverse();
		
		System.out.println("GATO: ");
		gato.hacersonido();
		gato.moverse();

	}

}
