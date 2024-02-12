package POO8_4;

public class MAIN {

	public static void main(String[] args) {
		FIGURA ASUS []= new FIGURA [2];
		ASUS[0] = new CIRCULO(5.0);
        ASUS[1] = new RECTANGULO(2.0,3.0);
       
   
       System.out.println("Area del circulo: " + ASUS[0].calculararea());
       System.out.println("Área del rectangulo: " + ASUS[1].calculararea());
        

	}

}
