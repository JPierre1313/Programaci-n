package POO7_2;

import javax.swing.JOptionPane;

public class CONVERSOR_TEMPERATURA {

	public static void main(String[] args) {
		temperatura NUEVA= new temperatura();
		NUEVA.set_temperaturaCelsius(Integer.parseInt(JOptionPane.showInputDialog("Temperatura en Celsius:")));
		 JOptionPane.showMessageDialog( null, "Temperatura: " + NUEVA.get_temperaturaCelsius() +" ºC" +
	 		        "\nTemperatura convertida: " + NUEVA.get_conversion()+" ºF");

	}

}
class temperatura{
	private  final double factor;
	private int constante;
	private int temperaturaCelsius;

public temperatura(){
	factor=1.8;
	constante=32;
	temperaturaCelsius=0;
}
public int get_temperaturaCelsius() {
	return temperaturaCelsius;
}
public void set_temperaturaCelsius(int temperaturaCelsius) {
	this.temperaturaCelsius=temperaturaCelsius;
}
public double get_conversion() {
	return((this.factor*this.temperaturaCelsius))+ constante;
}
}
