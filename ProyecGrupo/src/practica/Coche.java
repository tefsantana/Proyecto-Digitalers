package practica;

public class Coche extends Vehiculo {
//atributos
private String motor;
private String tipoCombustible;
private int cantDePuertas;
private float velocidadMaxima;


//contructores //
public Coche() {
	super();
}
public Coche(String duenio, int cantidadDeRuedas, int anio, String color, String marca, String modelo, float velocidad,
		int asientos, int asientosDisponibles, int asientosOcupados) {
	super(duenio, cantidadDeRuedas, anio, color, marca, modelo, velocidad, asientos, asientosDisponibles, asientosOcupados);
	
}
public Coche(String duenio, int anio, String color, String marca, String modelo, int asientos,String motor, String tipoCombustible, int cantDepuertas, float velocidadMaxima) {
	super(duenio, anio, color, marca, modelo, asientos);
	this.motor = motor;
	this.tipoCombustible = tipoCombustible;
	this.cantDePuertas = cantDepuertas;
	this.velocidadMaxima = velocidadMaxima;
	
}
public Coche(String motor, String tipoCombustible, int cantDepuertas, float velocidadMaxima) {
	this.motor = motor;
	this.tipoCombustible = tipoCombustible;
	this.cantDePuertas = cantDepuertas;
	this.velocidadMaxima = velocidadMaxima;
}

//get set
public String getMotor() {
	return motor;
}
public void setMotor(String motor) {
	this.motor = motor;
}
public String getTipoCombustible() {
	return tipoCombustible;
}
public void setTipoCombustible(String tipoCombustible) {
	this.tipoCombustible = tipoCombustible;
}
public int getCantDepuertas() {
	return cantDePuertas;
}
public void setCantDepuertas(int cantDepuertas) {
	this.cantDePuertas = cantDepuertas;
}
public float getVelocidadMaxima() {
	return velocidadMaxima;
}
public void setVelocidadMaxima(float velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
}


//metodos sobreescritos 

public String informarVelocidadActual() {
  return("La velocidad actual del Coche es " +velocidadActual+"KM/h");
}
public void acelerar() {
  velocidadActual*=2;
  System.out.println("Acelerando el Coche " + velocidadActual+"KM/h");
}
public void frenar() {
  velocidadActual/= 1.5;
  System.out.println("Frenando el Coche " + velocidadActual+"KM/h");
}

//to String
@Override
public String toString() {
	return "Coche [motor = " + motor + ", tipoCombustible = " + tipoCombustible + ", cantDepuertas = " + cantDePuertas
			+ ", velocidadMaxima = " + velocidadMaxima+"KM/h" + ", duenio = " + duenio + ", cantRuedas = " + cantRuedas + ", color = "
			+ color + ", marca = " + marca + ", anio = " + anio + ", modelo = " + modelo + ", velocidadActual = "
			+ velocidadActual+"KM/h" + ", asientos = " + asientos + ", asientosDisponibles = " + asientosDisponibles
			+ ", asientosOcupados = " + asientosOcupados + "]";
}

//metodos de la clase
public String medirAceite() {
    return "Aca midiendo el nivel de aceite";
}
public String informarFaltaCombustible() {
    return "Buenas " + this.duenio + " le falta combustible a su coche.";
}


}
