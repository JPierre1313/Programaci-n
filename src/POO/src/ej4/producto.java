package ej4;

public class producto {
String nombre;
double precio;
int stock;

public String get_nombre () {
	return nombre;
}
public double get_precio () {
	return precio;
}
public int get_stock () {
	return stock;
}
public void set_nombre(String nombre) {
	this.nombre= nombre;
}
public void set_precio(double precio) {
	this.precio= precio;
}
public void set_stock(int stock) {
	this.stock= stock;
}
}
