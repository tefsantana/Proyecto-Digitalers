package practica;

public class Vegetal {
protected boolean comestible;
protected String nombre;
protected String flor;
protected String raiz;
protected String tallo;
protected String hoja;
protected String tipo;
protected float altura;

////Constructores

public Vegetal(boolean comestible, String nombre, String flor, String raiz, String tallo, String hoja, String tipo,
		float altura) {
	super();
	this.comestible = comestible;
	this.nombre = nombre;
	this.flor = flor;
	this.raiz = raiz;
	this.tallo = tallo;
	this.hoja = hoja;
	this.tipo = tipo;
	this.altura = altura;
} 
public Vegetal() {
	
}
//Set y Get
public boolean isComestible() {
	return comestible;
}
public void setComestible(boolean comestible) {
	this.comestible = comestible;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getFlor() {
	return flor;
}
public void setFlor(String flor) {
	this.flor = flor;
}
public String getRaiz() {
	return raiz;
}
public void setRaiz(String raiz) {
	this.raiz = raiz;
}
public String getTallo() {
	return tallo;
}
public void setTallo(String tallo) {
	this.tallo = tallo;
}
public String getHoja() {
	return hoja;
}
public void setHoja(String hoja) {
	this.hoja = hoja;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}
// Metodos creados por Nosotros .. Holiis
public String realizarFotosintesis() {
    return "Realizando la Fotosintesis";
}

public String reproducirse() {
    return "Hay dos maneras de reproduccion de las plantas: sexual y asexual. Sexual comprende métodos como alogamia, polinización cruzada, dioecia, autogamia, etc. Asexual es mediante técnicas elaboradas por el hombre tales como acodo, estaca, injerto, esqueje, etc.";
}

public String respirar() {
    return "Soy un vegetal que esta respirando";
}

public String darSombra() {
    return "Solo estoy dando sombra";
}

public String devuelveOxigeno() {
    return "Soy un vegetal que devuelve oxigeno para que los seres vivos puedan respirar";
}
//toString()
@Override
public String toString() {
	return "Vegetal" +"\n "+" comestible = " + comestible +"\n "+
			" nombre = " + nombre +"\n "+ " flor = " + flor +"\n " +
			" raiz = " + raiz +"\n " + " tallo = "+ tallo +"\n " 
			+ " hoja = " + hoja +"\n "+ " tipo = " + tipo +"\n "+ 
			" altura = " + altura+" m" ;
}


}
