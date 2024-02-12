package POO8_4;

public class RECTANGULO extends FIGURA{
private double base;
private double altura;

public RECTANGULO(double base, double altura) {
	this.base = base;
	this.altura = altura;
}
public double getBase() {
	return base;
}
public double getAltura() {
	return altura;
}
@Override
public double calculararea() {
	return base* altura;
}
}
