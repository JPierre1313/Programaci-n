package POO5_2;

public class USO_EMPLEADO {

	public static void main(String[] args) {
		EMPLEADO XD= new EMPLEADO("Franco", 10000,2086,4,8);
		System.out.println("El empleado: " + XD.getNombre() + " tiene un sueldo de " + XD.getSueldo() + " € contratado a la fecha de " + XD.getAltacontrato());
		XD.subesueldo(10);
		System.out.println("Con el sueldo subido: " + XD.getSueldo()+ "€");
	

	}

}
