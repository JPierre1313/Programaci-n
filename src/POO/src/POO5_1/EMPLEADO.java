package POO5_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class EMPLEADO {
private String nombre;
private double sueldo;
private Date altacontrato;

public EMPLEADO(String nom,double sue, int anio , int mes ,int dia) {
	nombre=nom;
	sueldo=sue;
	GregorianCalendar Calendario= new GregorianCalendar(anio,mes-1,dia);
	altacontrato= Calendario.getTime();
}

public String getNombre() {
	return nombre;
}

public double getSueldo() {
	return sueldo;
}

public Date getAltacontrato() {
	return altacontrato;
}





}
