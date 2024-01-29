package POO4_2;

public class empleado {
	private String nombre;
	private int horas;
	private double tarifa;
	
	  public empleado(String nombre, int horas, double tarifa) {
	        this.nombre = nombre;
	        this.horas = horas;
	        this.tarifa = tarifa;
	    }
public String get_nombre() {
	return nombre;
}
public void set_nombre(String nombre) {
	this.nombre= nombre;
	}
public int get_horas() {
	return horas;
}
public void set_horas(int horas) {
	this.horas= horas;
}
public double get_tarifa() {
	return tarifa;
}
public void set_tarifa(double tarifa) {
	this.tarifa= tarifa;
}
public double calcularSalario() {
    return horas * tarifa;
}

}
