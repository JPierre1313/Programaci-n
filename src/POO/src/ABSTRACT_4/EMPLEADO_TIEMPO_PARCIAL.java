package ABSTRACT_4;

public class EMPLEADO_TIEMPO_PARCIAL extends EMPLEADO{
	private double salariohoras;
	private double horas;
	
	public EMPLEADO_TIEMPO_PARCIAL(double salariohoras , double horas) {
		this.salariohoras=salariohoras;
		this.horas=horas;
	}
	@Override
	public double calcularsalario() {
		return salariohoras*horas;
	}

}
