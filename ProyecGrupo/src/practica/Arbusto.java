package practica;

public class Arbusto extends Vegetal implements Actor{

private int cantDeRamitas;


//contructores
public Arbusto(boolean comestible, String nombre, String flor, String raiz, String tallo, String hoja, String tipo,
		float altura, int cantDeRamitas) {
	super(comestible, nombre, flor, raiz, tallo, hoja, tipo, altura);
	this.cantDeRamitas = cantDeRamitas;
}

public Arbusto(boolean comestible, String nombre, String flor, String raiz, String tallo, String hoja, String tipo,
		float altura) {
	super(comestible, nombre, flor, raiz, tallo, hoja, tipo, altura);
	
}

public Arbusto() {
	
}

public Arbusto(String nombre, String flor, String raiz, String tallo, String tipo, int cantDeRamitas) {
	this.nombre=nombre;
	this.flor=flor;
	this.raiz=raiz;
	this.tallo=tallo;
	this.tipo=tipo;
	this.cantDeRamitas = cantDeRamitas;
}

//Set y Get
public int getCantDeRamitas() {
	return cantDeRamitas;
}

public void setCantDeRamitas(int cantDeRamitas) {
	this.cantDeRamitas = cantDeRamitas;
}


//metodos de la interface
@Override
public String informarQueEs() {
	return SERVIVO+" y es un Arbusto";
}

@Override
public boolean activarActor() {
	return Arbusto.ACTIVO;
}

@Override
public boolean desactivarActor() {
    return Arbusto.INACTIVO;
}


//to String
@Override
public String toString() {
	return "Arbusto"+"\n"+" cantDeRamitas = " + cantDeRamitas +"\n"+ super.toString();
}

//metodo de arbusto
public String saludosDeArbusto(){
	return "Hola soy un arbusto y mi tamaño es mas chico que un arbol ";
}
}


