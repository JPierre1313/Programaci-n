package ABSTRACT_3;

public class PERSISTENCIABD extends PERSISTENCIA{
	@Override
	public void guardardatos() {
		System.out.println("NO SE HA PODIDO GUARDAR CORRECTAMENTE");
	}
	@Override 
	public void cargardatos() {
		System.out.println("EXITO AL CARGAR");
	}

}
