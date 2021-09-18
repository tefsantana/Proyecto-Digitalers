package practica;

import java.util.ArrayList;

public class Profesor extends Persona {
private double sueldo= 0;
private double sueldoBasico;
private int antiguedad;
private String titulo;
private ArrayList<String>listaDeMaterias;

//constructores

public Profesor(int dni, String nombre, String apellido, int edad, String direccion, double sueldoBasico,
		int antiguedad, String titulo, ArrayList<String> listaDeMaterias) {
	super(dni, nombre, apellido, edad, direccion);
	
	this.sueldoBasico = sueldoBasico;
	this.antiguedad = antiguedad;
	this.titulo = titulo;
	this.listaDeMaterias = listaDeMaterias;
}

public Profesor() {
	
}
//Set Y Get
/**public double getSueldo() {
	return sueldo;
}

public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
**/
public double getSueldoBasico() {
	return sueldoBasico;
}

public void setSueldoBasico(double sueldoBasico) {
	this.sueldoBasico = sueldoBasico;
}

public int getAntiguedad() {
	return antiguedad;
}

public void setAntiguedad(int antiguedad) {
	this.antiguedad = antiguedad;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public ArrayList<String> getListaDeMaterias() {
	return listaDeMaterias;
}

public void setListaDeMaterias(ArrayList<String> listaDeMaterias) {
	this.listaDeMaterias = listaDeMaterias;
}
//metodos que creamos nosotros 
public double calcularSueldo()
{   
	switch (this.antiguedad) {
		case 1:
			this.sueldo = this.sueldoBasico;
			break;
		case 2:
			 this.sueldo = (this.sueldoBasico*1.10);
		case 3:
			 this.sueldo = (this.sueldoBasico*1.15);
		case 4:
			 this.sueldo = (this.sueldoBasico*1.20);
		case 5:
			 this.sueldo = (this.sueldoBasico*1.25);	 	 	 		
	
		default:
			if(this.antiguedad>5)
			this.sueldo = (this.sueldoBasico*1.35);
			break;
	}
	return sueldo; //creo que ya esta
};
public int informarCantMaterias() {
	if(this.listaDeMaterias.isEmpty()) {
	return 0;
	}
	else {
		return this.listaDeMaterias.size();	
	}
	
}
public void agregarMateria(String materia) {
	this.listaDeMaterias.add(materia);
}
public String enseniar() {
	return "Dando clases";
}
//to String

@Override
public String toString() {
	
	return "Profesor [sueldo = " + sueldo + ", sueldoBasico = " + sueldoBasico + ", antiguedad = " + antiguedad + ", titulo = "
			+ titulo+" " + super.toString() +"]";
}



}
