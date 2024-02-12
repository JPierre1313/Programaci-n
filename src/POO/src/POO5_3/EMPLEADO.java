package POO5_3;

import java.util.Date;
import java.util.GregorianCalendar;

public class EMPLEADO {
	private Date altacontrato;
	
public EMPLEADO(int anio , int mes, int dia) {
	GregorianCalendar Calendario= new GregorianCalendar(anio,mes-1,dia);
	altacontrato= Calendario.getTime();
}
public Date getAltacontrato() {
	return altacontrato;
}

}
