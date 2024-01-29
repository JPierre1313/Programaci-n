package POO4_4;

public class Producto {
	private String nombre;
	private int cantidad;
	private int precio;
	
public Producto (String nombre, int cantidad, int precio){
	this.nombre=nombre;
	this.cantidad=cantidad;
	this.precio=precio;
}
public String get_nombre() {
	return nombre;
}
public void set_nombre(String nombre) {
	this.nombre=nombre;
}
public int get_cantidad() {
	return cantidad;
}
public void set_cantidad(int cantidad) {
	this.cantidad=cantidad;
}
public int get_precio() {
	return precio;
}
public void set_precio(int precio) {
	this.precio=precio;
	
	
}

}
