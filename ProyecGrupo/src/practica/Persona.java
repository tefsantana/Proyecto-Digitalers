package practica;

public abstract class Persona implements Actor{

protected int dni;
protected String nombre;
protected int edad;
protected String direccion;
protected String apellido;

//Set y Get
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}


//contructores // sobre carga de contructores cuando hay mas de uno
public Persona(int dni, String nombre, String apellido, int edad, String direccion) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.direccion = direccion;
	
}
public Persona () {
	
}
public Persona(int dni, String nombre,String apellido, int edad) {
	this.dni = dni;
	this.nombre = nombre;
	this.edad = edad;
	this.apellido = apellido;
}

@Override
public String toString() {
	return "Persona [DNI = " + dni + ", nombre = " + nombre + ", edad = " + edad + ", direccion = " + direccion + ", apellido = "
			+ apellido + "]";
}
//metodos de la interface
@Override
public String informarQueEs() {
	return SERVIVO;
}
@Override
public boolean activarActor() {
	return Persona.ACTIVO;
	}
@Override
public boolean desactivarActor() {
    return Persona.INACTIVO;
}

// metodos de persona
public String saludar() {
	return "Holiiis ! :) ;)";
}
public String aprender() {
	return "Aca aprendiendo programacion!";
	
}
}
