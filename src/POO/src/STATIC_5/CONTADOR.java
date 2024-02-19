package STATIC_5;

public class CONTADOR {
private static int contador;

public CONTADOR( int contador) {
	
	this.contador=contador;
	
}

public static int obtenerContadorLlamadas() {
    return contador;
}
}
