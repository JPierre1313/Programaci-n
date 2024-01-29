package POO4_3;

import javax.swing.JOptionPane;

public class Uso_Curso {
	public static void main(String[] args) {
        Curso curso= new Curso();

        
        String nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso:");
        curso.set_nombre(nombreCurso);

       
        String calificacionString = JOptionPane.showInputDialog("Ingrese la calificación del curso:");
        double calificacion = Double.parseDouble(calificacionString);
        curso.set_calificacion(calificacion);

        
        curso.categorianotas();
    }

}
