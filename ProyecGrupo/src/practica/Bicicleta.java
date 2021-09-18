package practica;
//esta class es una que hicimos en clases le falta agregar nuestro metodos y atributos
public class Bicicleta extends Vehiculo{
//atributos
private int platoActual;
private int pinionActual;

//contructores //

public Bicicleta(String duenio, int cantidadDeRuedas, int anio, String color, String marca, String modelo,
		float velocidad, int asientos, int asientosDisponibles, int asientosOcupados, int pla, int pin) {
	super(duenio, cantidadDeRuedas, anio, color, marca, modelo, velocidad, asientos, asientosDisponibles, asientosOcupados);
	 this.platoActual = pla;
	 this.pinionActual = pin;
	
}

public Bicicleta(String duenio, int anio, String color, String marca, String modelo, int asientos, int pla, int pin) {
	super(duenio, anio, color, marca, modelo, asientos);
	 this.platoActual = pla;
	 this.pinionActual = pin;
	
}

public Bicicleta(float velo, int pla, int pin) {
    this.velocidadActual = velo;
    this.platoActual = pla;
    this.pinionActual = pin;
}
public Bicicleta() {

}

//Set Y Get
public float getVelocidadActual() {
    return velocidadActual;
}

public int getPlatoActual() {
	return platoActual;
}

public void setPlatoActual(int platoActual) {
	this.platoActual = platoActual;
}

public int getPinionActual() {
	return pinionActual;
}

public void setPinionActual(int pinionActual) {
	this.pinionActual = pinionActual;
}

//metodos sobreescritos 

public String informarVelocidadActual() {
    return("La velocidad actual de la bicicleta es de " +velocidadActual+"KM/h");
}
public void acelerar() {
    velocidadActual*=0.6;
    System.out.println("Acelerando " + velocidadActual);
}
public void frenar() {
    velocidadActual/=0.5;
    System.out.println("frenando " + velocidadActual);
}


//to String
@Override
public String toString() {
	return "Bicicleta [platoActual = " + platoActual + ", pinionActual = " + pinionActual + ", duenio = " + duenio
			+ ", cantRuedas = " + cantRuedas + ", color = " + color + ", marca = " + marca + ", anio = " + anio + ", modelo = "
			+ modelo + ", velocidadActual = " + velocidadActual+"KM/h" + ", asientos = " + asientos + ", asientosDisponibles = "
			+ asientosDisponibles + ", asientosOcupados = " + asientosOcupados + "]";
}

//metodos de la clase
public void cambiarPlato(int plato) {
    platoActual = plato;
    System.out.println("Actualizamos el/los platos a " 
    + platoActual);
}


public void cambiarPinion(int pinion) {
    pinionActual = pinion;
    System.out.println("Actualizamos los piniones a "
            + pinionActual);
}
public void informarEstadoActual() {
    System.out.println("La velocidad actual es de " + velocidadActual + ", platos " + platoActual + " y pinion " + pinionActual);
}

}
