package POO1;

public class COCHE {
private int ruedas;
private int largo;
private int ancho;
private int motor;
private int peso;
String color;
int pesototal;
boolean asientos_cuero, climatizador;

public COCHE() {
	ruedas= 4;
	largo=250;
	ancho=134;
	motor=396;
	peso=421;
	pesototal=1000;
	color="Azul";
	
}
public String dime_motor() {
	return "El motor del coche tiene " + motor + " caballos de potencia";
}	
public void establece_color() {
	color= "Azul";
}
	
public String dime_color() {
	return "El color de tu coche es " + color;
}
public String dime_pesototal() {
	return "El peso total de tu coche es " + pesototal +"kg";
}
public void set_color(String nuevocolor) {
	color=nuevocolor;
}
}

