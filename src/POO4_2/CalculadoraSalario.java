package POO4_2;

import javax.swing.JOptionPane;

public class CalculadoraSalario {
	public static void main(String[] args) {
		empleado[] empleados = new empleado [5];
		for (int i = 0; i < 5; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado #" + (i + 1));
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por " + nombre));
            double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por hora para " + nombre));
            
            empleado JP = new empleado(nombre, horas, tarifa);
            empleados[i] = JP;
	}
		for (empleado empleado : empleados) {
            double salario = empleado.calcularSalario();
            JOptionPane.showMessageDialog(null, "El salario de " + empleado.get_nombre() + " es: $" + salario);
        }
    }

}
