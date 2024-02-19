package ABSTRACT_4;

public class MAIN {

	public static void main(String[] args) {
		EMPLEADO blanco= new EMPLEADO_TIEMPO_COMPLETO(2000.80);
		EMPLEADO negro= new EMPLEADO_TIEMPO_PARCIAL(3.0,22.0);
		
		System.out.println("SALARIO DEL EMPLEADO A TIEMPO COMPLETO: " + blanco.calcularsalario()+ " €");
		System.out.println("SALARIO DEL EMPLEADO A TIEMPO PARCIAL: " + negro.calcularsalario()+ " €");

	}

}
