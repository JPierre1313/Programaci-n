package ABSTRACT_3;

public class MAIN {

	public static void main(String[] args) {
		PERSISTENCIA x= new PERSISTENCIAARCHIVO();
		PERSISTENCIA y= new PERSISTENCIABD();
		
		System.out.println("ARCHIVOS: ");
		x.guardardatos();
		x.cargardatos();
		
		System.out.println("BBDD: ");
		y.guardardatos();
		y.cargardatos();

	}

}
