package STATIC;

public class CONTADOR_INSTANCIAS {
private static int contador=0;
public CONTADOR_INSTANCIAS() {
	contador++;
}
public static int obtenernumeros() {
	return contador;
}

}
