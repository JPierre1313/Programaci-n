package ej3;

public class usoestudiante {

	public static void main(String[] args) {
		ESTUDIANTE DB= new ESTUDIANTE();
		DB.set_nombre("VEGETA");
		DB.set_edad(80);
		DB.set_notas(8.2);
		System.out.println("El estudiante "+ DB.get_nombre());
		System.out.println("Cuya edad es de "+ DB.get_edad());
		System.out.println("Tiene "+ DB.get_notas() + " como nota");

	}

}
