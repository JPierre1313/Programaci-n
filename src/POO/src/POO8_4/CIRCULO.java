package POO8_4;

public class CIRCULO extends FIGURA {
private double radio;

public CIRCULO(double radio) {
	this.radio=radio;
}

@Override
public double calculararea() {
	return Math.PI * radio * radio;
}
}
