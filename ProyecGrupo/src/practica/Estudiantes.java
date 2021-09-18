package practica;

public class Estudiantes extends Persona {
private int legajo;
private String carrera;
private int materiasAprobadas;
private int materiaTotales;

//Constructores -- falta ver si le agregamos mas metodos o atributos
public Estudiantes() {
	
}

public Estudiantes(int dni, String nombre, String apellido, int edad, String direccion, int legajo, String carrera,
		int materiasAprobadas, int materiaTotales) {
	super(dni, nombre, apellido, edad, direccion);
	this.legajo = legajo;
	this.carrera = carrera;
	this.materiasAprobadas = materiasAprobadas;
	this.materiaTotales = materiaTotales;
}

//Set y Get
public int getLegajo() {
	return legajo;
}

public void setLegajo(int legajo) {
	this.legajo = legajo;
}

public String getCarrera() {
	return carrera;
}

public void setCarrera(String carrera) {
	this.carrera = carrera;
}

public int getMateriasAprobadas() {
	return materiasAprobadas;
}

public void setMateriasAprobadas(int materiasAprobadas) {
	this.materiasAprobadas = materiasAprobadas;
}

public int getMateriaTotales() {
	return materiaTotales;
}

public void setMateriaTotales(int materiaTotales) {
	this.materiaTotales = materiaTotales;
}

//metodos de estudiante
public void aprobarMateria() {
	if((this.materiaTotales-this.materiasAprobadas)>0) {
		this.materiasAprobadas++;
	}
	//else { 
	//	System.out.println("No puede aprobar mas materias ya aprobo todas las maaterias");
	//}
	
}

public double calcularPorcentaje() {
	return ((this.materiasAprobadas*this.materiaTotales)/100);
}

public String informarPorcentaje() {
	return ("El procentaje aprobado es: "+this.calcularPorcentaje()+"%");
}

//toString()
@Override
public String toString() {
	return "Estudiantes [legajo = " + legajo + ", carrera = " + carrera + ", materiasAprobadas = " + materiasAprobadas
			+ ", materiaTotales = " + materiaTotales + "]";
}


}
