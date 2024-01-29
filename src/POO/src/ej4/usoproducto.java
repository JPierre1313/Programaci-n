package ej4;

public class usoproducto {

	public static void main(String[] args) {
		producto X = new producto();
		X.set_nombre("AIRPODS");
		X.set_precio(239.99);
		X.set_stock(1000);
		System.out.println("Los productos son "+ X.get_nombre());
		System.out.println("Tiene el precio de "+ X.get_precio()+" $");
		System.out.println("Y tiene un stock de "+ X.get_stock()+" productos");

	}

}
