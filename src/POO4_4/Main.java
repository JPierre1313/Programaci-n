package POO4_4;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		Producto[]X= new Producto[3];
		for (int i = 0; i < 3; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto #" + (i + 1));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("La cantidad de " + nombre ));
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Precio: " + nombre ));
            Producto JP = new Producto(nombre, cantidad, precio);
            X[i] = JP;
            
            JOptionPane.showMessageDialog( null, "Producto: " + nombre +
    		        "\ncantidad: " + cantidad+"uds"+
    		        "\nprecio: " + precio+"€");
	}
		
}
	
}