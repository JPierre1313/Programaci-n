package POO8_1;

public class AUTOMOVIL extends VEHICULO{
private String tipocombustible;

//constructor
public AUTOMOVIL(String marca , String modelo, int año, String tipocombustible ) {
	super(marca,modelo,año);
	this.tipocombustible=tipocombustible;
}
public void mostrardatos() {
	System.out.println("La marca es " + getMarca() + 
			"\nEl modelo es " + getModelo()+ 
			"\nEl año es " + getAño()+ 
			"\nEl tipo de combustible es " + tipocombustible);
}
}
