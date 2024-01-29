package POO4_3;

import javax.swing.JOptionPane;

public class Curso {
	private String nombre;
	private double calificacion;


public Curso() {
	
}
public String get_nombre() {
	return nombre;
}
public void set_nombre(String nombre) {
	this.nombre=nombre;
}
public void set_calificacion(double calificacion) {
	this.calificacion=calificacion;
}
public void categorianotas() {
	char categoria;
	switch ((int) calificacion / 10) {
    case 10:
    case 9:
        categoria = 'A';
        break;
    case 8:
        categoria = 'B';
        break;
    case 7:
        categoria = 'C';
        break;
    case 6:
        categoria = 'D';
        break;
    default:
        categoria = 'F';
        break;
} 
	  JOptionPane.showMessageDialog(null, "Curso: " + nombre +
              "\nCalificación: " + calificacion +
              "\nCategoría: " + categoria);
}

}