package POO1;

public class USOCOCHE {

	public static void main(String[] args) {
		COCHE FORD= new COCHE();
	
		System.out.println(FORD.dime_motor());
		System.out.println(FORD.dime_color());
		COCHE SUBARU = new COCHE();
		SUBARU.establece_color();
		System.out.println(SUBARU.dime_motor());
		System.out.println(SUBARU.dime_color());
		System.out.println(SUBARU.dime_pesototal());
		SUBARU.set_color("morado");
		System.out.println(SUBARU.dime_color());

	}

}
