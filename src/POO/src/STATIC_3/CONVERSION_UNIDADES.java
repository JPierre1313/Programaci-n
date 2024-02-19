package STATIC_3;

public class CONVERSION_UNIDADES {
private static int num1;
private static double num2=1.60934;
private static double num3=1.8;

public CONVERSION_UNIDADES(int num1) {
	this.num1=num1;
	
}
public static double calculardistancia() {
	return (num1 * 1)/num2;
}
public static double calculartemperatura() {
	return (num3*num1)+ 32;
}

}
