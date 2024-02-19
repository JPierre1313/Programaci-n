package STATIC_2;

public class CALCULADORA {
private static int num1;
private static int num2;

public CALCULADORA(int num1, int num2) {
	this.num1=num1;
	this.num2=num2;
}
public static int multiplicacion() {
	return num1*num2;
}
public static int suma() {
	return num1+num2;
}
public static int resta() {
	return num1-num2;
}
public static int division() {
	return num1/num2;
}
}
