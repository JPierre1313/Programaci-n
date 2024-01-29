package POO3_3;

public class Main {
	public class Ingrediente {
	    private String nombre;

	    public Ingrediente(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getNombre() {
	        return nombre;
	    }
	}
	 public static void main(String[] args) {
	        // Ejemplo de uso
	        Receta miReceta = new Receta();

	        // Añadir ingredientes
	   

	        miReceta.agregarIngrediente("harina");;
	        miReceta.agregarIngrediente("azucar");
	        miReceta.agregarIngrediente("huevos");

	        // Añadir pasos
	        miReceta.agregarPaso("Mezclar la harina con el azúcar.");
	        miReceta.agregarPaso("Añadir los huevos y mezclar bien.");
	        miReceta.agregarPaso("Hornear la masa a 180 grados durante 30 minutos.");

	        // Mostrar la receta completa
	        miReceta.mostrarRecetaCompleta();
	    }

}
