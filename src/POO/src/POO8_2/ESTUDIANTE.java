package POO8_2;

public class ESTUDIANTE extends PERSONA{
private String carrera;

public ESTUDIANTE (String nombre,int edad, String carrera) {
	super(nombre,edad);
	this.carrera=carrera;
}
public void mostrardatos() {
	System.out.println("El nombre es " + getNombre() +
			"\nLa edad es "+ getEdad() +
	        "\nLa carrera es " + carrera);
}
}
