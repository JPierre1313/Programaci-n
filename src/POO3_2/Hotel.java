package POO3_2;

import java.util.Scanner;

public class Hotel {
	private HABITACION[] habitaciones;

    public Hotel(int numHabitaciones) {
        habitaciones = new HABITACION[numHabitaciones];
        // Inicializar las habitaciones del hotel
        for (int i = 0; i < numHabitaciones; i++) {
            if (i % 3 == 0) {
                habitaciones[i] = new HABITACION(i + 1, "Suite");
            } else if (i % 2 == 0) {
                habitaciones[i] = new HABITACION(i + 1, "Doble");
            } else {
                habitaciones[i] = new HABITACION(i + 1, "Simple");
            }
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad de habitaciones:");
        for (HABITACION habitacion : habitaciones) {
            String estado = habitacion.isOcupada() ? "Ocupada" : "Disponible";
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() +
                    " - Tipo: " + habitacion.getTipo() + " - Estado: " + estado);
        }
    }

    public void reservarHabitacion(int numeroHabitacion) {
        HABITACION habitacion = obtenerHabitacion(numeroHabitacion);
        if (habitacion != null && !habitacion.isOcupada()) {
            habitacion.reservar();
        } else {
            System.out.println("La habitación no está disponible para reserva.");
        }
    }

    public void cancelarReserva(int numeroHabitacion) {
        HABITACION habitacion = obtenerHabitacion(numeroHabitacion);
        if (habitacion != null && habitacion.isOcupada()) {
            habitacion.cancelarReserva();
        } else {
            System.out.println("La habitación no está reservada.");
        }
    }

    private HABITACION obtenerHabitacion(int numeroHabitacion) {
        for (HABITACION habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                return habitacion;
            }
        }
        System.out.println("La habitación solicitada no existe.");
        return null;
    }

    public static void main(String[] args) {
        Hotel miHotel = new Hotel(3);
        Scanner scanner = new Scanner (System.in);

        

        miHotel.mostrarDisponibilidad();
        System.out.println("Introduce la habitacion: ");
        miHotel.reservarHabitacion(scanner.nextInt());
        System.out.println();


        miHotel.mostrarDisponibilidad();
        System.out.println();
        
        System.out.println("Introduce la habitacion que quieres cancelar la reserva: ");
        miHotel.cancelarReserva(scanner.nextInt());
        System.out.println();

        miHotel.mostrarDisponibilidad();
        scanner.close();
    }
}
