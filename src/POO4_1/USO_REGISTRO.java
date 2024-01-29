package POO4_1;

import javax.swing.JOptionPane;

public class USO_REGISTRO {
	public static void main(String[] args) {
		REGISTRO_ESTUDIANTES NEY = new REGISTRO_ESTUDIANTES();	
		NEY.setNombre(JOptionPane.showInputDialog("Introduce tu nombre: "));
		NEY.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: ")));
		NEY.setGrado(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu grado: ")));
		
        System.out.println("EL nombre es:  "+ NEY.getNombre());
        System.out.println("La edad es: " + NEY.getEdad());
        System.out.println("El grado es: " + NEY.getGrado());
        
        System.out.println();
        
        REGISTRO_ESTUDIANTES MESSI = new REGISTRO_ESTUDIANTES();
        MESSI.setNombre(JOptionPane.showInputDialog("Introduce tu nombre "));
        MESSI.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: ")));
        MESSI.setGrado(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu grado: ")));
        
        System.out.println("EL nombre es:  "+ MESSI.getNombre());
        System.out.println("La edad es: " + MESSI.getEdad());
        System.out.println("El grado es:  "+ MESSI.getGrado());
        
        System.out.println();
        
        REGISTRO_ESTUDIANTES LUIS = new REGISTRO_ESTUDIANTES();
        LUIS.setNombre(JOptionPane.showInputDialog("Introduce tu nombre: "));
        LUIS.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: ")));
        LUIS.setGrado(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu grado: ")));
        
        System.out.println("EL nombre es: " + LUIS.getNombre());
        System.out.println("La edad es: "+ LUIS.getEdad());
        System.out.println("El grado es:  "+ LUIS.getGrado());
	}

}
	


