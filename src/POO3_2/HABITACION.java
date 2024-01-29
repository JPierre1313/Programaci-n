package POO3_2;

public class HABITACION {
	  private int numeroHabitacion;
	    private String tipo;
	    private boolean ocupada;

	    public HABITACION(int numeroHabitacion, String tipo) {
	        this.numeroHabitacion = numeroHabitacion;
	        this.tipo = tipo;
	        this.ocupada = false;
	    }

	    public int getNumeroHabitacion() {
	        return numeroHabitacion;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public boolean isOcupada() {
	        return ocupada;
	    }

	    public void reservar() {
	        ocupada = true;
	        System.out.println("La habitación " + numeroHabitacion + " ha sido reservada.");
	    }

	    public void cancelarReserva() {
	        ocupada = false;
	        System.out.println("La reserva de la habitación " + numeroHabitacion + " ha sido cancelada.");
	    }
}