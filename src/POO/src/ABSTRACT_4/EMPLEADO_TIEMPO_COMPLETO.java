package ABSTRACT_4;

public class EMPLEADO_TIEMPO_COMPLETO extends EMPLEADO {
	private double salario;
	
	public EMPLEADO_TIEMPO_COMPLETO(double salario) {
		this.salario=salario;
	}
	@Override
	public double calcularsalario() {
		return salario;
	}

}
