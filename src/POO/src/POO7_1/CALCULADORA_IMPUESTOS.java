package POO7_1;

import javax.swing.JOptionPane;

public class CALCULADORA_IMPUESTOS {
	public static void main(String[] args) {
		calculadora X =new calculadora();
		
		X.set_precio(Double.parseDouble(JOptionPane.showInputDialog("Precio del producto")));
		 JOptionPane.showMessageDialog( null, "Precio producto: " + X.get_precio() +" €" +
 		        "\nPrecio final con impuesto: " + X.get_preciofinal()+" €");
		
		
	}

	


}
class calculadora{
	private  final double porcentaje;
	private double precio;
	
	
	public calculadora() {
		 porcentaje= 0.15;
		 precio=0;
		
	}
	public double get_precio() {
		return precio;
	}
	public void set_precio(double precio) {
		this.precio=precio;
	} 
	public double get_preciofinal() {
		return  ((this.porcentaje*this.precio)) + precio;
		
		 
		
	}
	
}
