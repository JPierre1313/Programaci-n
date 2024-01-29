package POO3_1;

public class RELOJ {
	private String horalarma;
	private String horactual;
	private boolean alarma;
	
	// CONSTRUCTOR
	public RELOJ(String horalarma, String horactual, boolean alarma) {
		this.horalarma= horalarma;
		this.horactual= horactual;
		this.alarma= alarma;
	}
	// GETTERS AND SETTERS
	public String get_horalarma() {
		return horalarma;
	}
	public void set_horalarma(String horalarma) {
		this.horalarma= horalarma;
	}
	public String get_horactual() {
		return horactual;
	}
	public void set_horactual(String horactual) {
		this.horactual= horactual;
	}
	public boolean get_alarma() {
		return alarma;
	}
	public void set_alarma(boolean alarma) {
		this.alarma= alarma;
	}
	  // METODO PARA ACTUALIZAR HORA ACTUAL
    public void actualizarHoraActual(String nuevaHora) {
        this.horactual = nuevaHora;
    }
    // METODO PARA COMPROBAR LA ALARMA Y ACTIVARLA
    public void comprobarAlarma() {
        if (alarma && horactual.equals(horalarma)) {
            System.out.println("¡Alarma sonando!");
        }else {
        	System.out.println("Aun queda para la alarma");
        }
    }

}
