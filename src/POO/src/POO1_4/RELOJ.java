package POO1_4;

public class RELOJ {
String marca;
boolean digital;
double precio;


public RELOJ () {
	
	marca="Viceroy";
	precio= 100.59;
	digital=true;
}
public String tipo() {
	return digital ? "digital":"analogico";
}
}
