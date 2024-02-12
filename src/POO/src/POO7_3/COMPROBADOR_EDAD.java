package POO7_3;

import javax.swing.JOptionPane;

public class COMPROBADOR_EDAD {

	public static void main(String[] args) {
		edad VOX = new edad();
		VOX.set_edad(Integer.parseInt(JOptionPane.showInputDialog("Edad de la persona:")));
		 JOptionPane.showMessageDialog( null, "Edad: " + VOX.get_edad()+" años" );	       
		 VOX.comprobaredad();

	}

}
class edad {
	private final int edad_minima;
	private int edad;
	private boolean Edad;
	

public edad() {
	edad_minima=18;
	edad=0;
	Edad=true;
	
}
public int get_edad() {
	return edad;
}
public void set_edad(int edad) {
	this.edad=edad;
}
public void comprobaredad() {
    if (Edad && edad == edad_minima) {
   	 JOptionPane.showMessageDialog(null, "¡Puedes votar!");
    }else {
   	 JOptionPane.showMessageDialog(null,"Aun te queda un huevo para votar");
    }
}
}