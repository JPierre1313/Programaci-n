package ABSTRACT_3;

public class PERSISTENCIAARCHIVO extends PERSISTENCIA{
	@Override
	public void guardardatos() {
		System.out.println("ARCHIVOS GUARDADOS");
	}
	@Override
	public void cargardatos() {
		System.out.println("ERROR AL CARGAR DATOS");
	}

}
