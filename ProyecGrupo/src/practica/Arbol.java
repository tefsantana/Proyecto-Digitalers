package practica;

public class Arbol extends Vegetal implements Actor {

private String corona;

//Constructores
public Arbol() {

}

public Arbol(boolean comestible, String nombre, String flor, String raiz, String tallo, String hoja, String tipo, float altura, String corona) {
    super(comestible, nombre, flor, raiz, tallo, hoja, tipo, altura);
    this.corona = corona;
}

//Set y Get

public String getcorona() {
    return corona;
}

public void setCorona(String corona) {
    this.corona = corona;
}

//metodos de la interface
@Override
public String informarQueEs() {
	return SERVIVO + " y es un Arbol";
}

@Override
public boolean activarActor() {
	return Arbol.ACTIVO;
}

@Override
public boolean desactivarActor() {
    return Arbol.INACTIVO;
}

@Override
public String toString() {
	return "Arbol"+"\n"+" corona = " + corona + " " +"\n"+ super.toString();
}


//metodo de arbol
public String saludosDeArbol(){
	return "Hola soy un arbol y mi tamaño es mas grande que un arbusto";
}

}
