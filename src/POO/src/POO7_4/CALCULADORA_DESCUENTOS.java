package POO7_4;

import javax.swing.JOptionPane;

public class CALCULADORA_DESCUENTOS {

	public static void main(String[] args) {
		descuentos NUEVOS= new descuentos();
		NUEVOS.set_cantidad(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de producto/s:")));
		NUEVOS.set_preciounitario(Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto:")));
		JOptionPane.showMessageDialog( null, "Cantidad: " + NUEVOS.get_cantidad() +" uds" +
 		        "\nPrecio: " + NUEVOS.get_preciounitario()+" €"+
		         "\nPrecio con decuento: " + NUEVOS.obtener_descuento());
		



	}

}
class descuentos {
	private final double descuento;
	private double preciounitario;
	private int cantidad;
	
public descuentos() {
	descuento=0.10;
	preciounitario=0.0;
	cantidad=0;
}
public int get_cantidad() {
	return cantidad;
}
public void set_cantidad(int cantidad) {
	this.cantidad=cantidad;
}
public double get_preciounitario() {
	return preciounitario;
}
public void set_preciounitario(double preciounitario) {
	this.preciounitario=preciounitario;
}
public double obtener_descuento() {
	
	if(cantidad>5) {
		return cantidad* preciounitario* (1-descuento);
	
	}else {
		return preciounitario*cantidad;
	}
	
	
	
	
 
} 
}