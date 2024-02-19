package ABSTRACT_1;

public class MAIN {

	public static void main(String[] args) {
		VEHICULO coche= new COCHE();
		VEHICULO moto= new MOTO();
		
		System.out.println("COCHE: ");
		coche.acelerar();
		coche.frenar();
		
		System.out.println("MOTO: ");
		moto.acelerar();
		moto.frenar();

	}

}
