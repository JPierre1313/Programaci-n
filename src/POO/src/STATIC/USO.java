package STATIC;

public class USO {

	public static void main(String[] args) {
		CONTADOR_INSTANCIAS X = new CONTADOR_INSTANCIAS();
		System.out.println("Numero de instancias: " + CONTADOR_INSTANCIAS.obtenernumeros());
		CONTADOR_INSTANCIAS X2 = new CONTADOR_INSTANCIAS();
		System.out.println("Numero de instancias: " + CONTADOR_INSTANCIAS.obtenernumeros());

	}

}
