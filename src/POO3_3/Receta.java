package POO3_3;

import java.util.ArrayList;



public class Receta {
	    private ArrayList<String> ingredientes;
	    private ArrayList<String> pasos;

	    // Constructor
	    public Receta() {
	        this.ingredientes = new ArrayList<>();
	        this.pasos = new ArrayList<>();
	    }

	    // Método para añadir un ingrediente a la receta
	    public void agregarIngrediente(String ingrediente) {
	        ingredientes.add(ingrediente);
	    }

	    // Método para eliminar un ingrediente de la receta
	    public void eliminarIngrediente(String ingrediente) {
	        ingredientes.remove(ingrediente);
	    }

	    // Método para añadir un paso a la receta
	    public void agregarPaso(String paso) {
	        pasos.add(paso);
	    }

	    // Método para mostrar la receta completa
	    public void mostrarRecetaCompleta() {
	        System.out.println("Ingredientes:");
	        for (String ingrediente : ingredientes) {
	            System.out.println("- " + ingrediente);
	        }

	        System.out.println("\nPasos:");
	        for (int i = 0; i < pasos.size(); i++) {
	            System.out.println((i + 1) + ". " + pasos.get(i));
	        }

}
	    
	    
}