package POO7_5;

import javax.swing.JOptionPane;

public class DETERMINADORANIOBISIESTO {
	private int anio;
    private final int DIVISIBLE_POR_4 = 4;
    private final int DIVISIBLE_POR_100 = 100;
    private final int DIVISIBLE_POR_400 = 400;

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método principal
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un año:");

        int anio = Integer.parseInt(input);

        DETERMINADORANIOBISIESTO determinador = new DETERMINADORANIOBISIESTO();
        
        determinador.setAnio(anio);

        if (determinador.esBisiesto()) {
            JOptionPane.showMessageDialog(null, determinador.getAnio() + " es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, determinador.getAnio() + " no es un año bisiesto.");
        }
    }
    public boolean esBisiesto() {
        return (anio % DIVISIBLE_POR_4 == 0 && (anio % DIVISIBLE_POR_100 != 0 || anio % DIVISIBLE_POR_400 == 0));
    }
}

