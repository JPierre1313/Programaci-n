package STATIC_2;

public class USO_CALCULADORA {

	public static void main(String[] args) {
		CALCULADORA SONY= new CALCULADORA(6,8);
		System.out.println("Multiplicacion :" + CALCULADORA.multiplicacion());
		System.out.println("Suma: " + CALCULADORA.suma());
		System.out.println("Resta: " + CALCULADORA.resta() );
		System.out.println("Division: " + CALCULADORA.division());

	}

}
