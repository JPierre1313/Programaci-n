package POO7;

public class PRUEBAS {

	public static void main(String[] args) {
		empleados trabajador1= new empleados("Eustakia");
		empleados trabajador2= new empleados("Franco");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		
		trabajador1.cambiaSeccion("Recursos humanos");

	}

}
class empleados {
	private final String nombre;
	private String seccion;
	
	public empleados(String nom) {
		nombre= nom;
		seccion="Administracion";
	}
	public void cambiaSeccion(String seccion) {
	this.seccion= seccion;	
	}
	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es "+ seccion;
	}

	}