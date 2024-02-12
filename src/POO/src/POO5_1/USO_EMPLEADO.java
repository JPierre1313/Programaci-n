package POO5_1;

public class USO_EMPLEADO {

	public static void main(String[] args) {
		EMPLEADO empleado1= new EMPLEADO("Jean Pierre", 10000,2026,4,8);
		System.out.println("El empleado: " + empleado1.getNombre() + " tiene un sueldo de " + empleado1.getSueldo() + " € contratado a la fecha de " + empleado1.getAltacontrato());

	}

}
