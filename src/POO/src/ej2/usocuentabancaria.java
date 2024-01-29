package ej2;

public class usocuentabancaria {

	public static void main(String[] args) {
		cuentabancaria BBVA = new cuentabancaria();
		BBVA.set_titular("MESSI");
		BBVA.set_saldo(1000.80);
		System.out.println("El titular es "+ BBVA.get_titular());
		System.out.println("El saldo es "+ BBVA.get_saldo());

	}

}
