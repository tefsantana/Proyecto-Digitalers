package practica;
import java.util.ArrayList;
public class AppPrincipal {

	public static void main(String[] args) {
		//persona/estudiante
		System.out.println();
		System.out.println("**********************************");
		System.out.println("PERSONA");
		Persona perE= new Estudiantes(35664, "Pedro", "Lopez", 25, "Cordoba 349", 101123, "Comunicaci�n Social", 15, 20);
		if(perE.activarActor()) {
			System.out.println("Actor Estudiante Activo");
			}
			else {
				System.out.println("Actor Estudiante Inactivo");
			}
		System.out.println(perE.informarQueEs());
		System.out.println(perE.saludar());
		System.out.println(perE.aprender());
		System.out.println(perE.toString());
		
		//estudiante
		System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("ESTUDIANTE");
		Estudiantes estudy1 = new Estudiantes(935664, "Jacinto", "Gonzalez", 20, "9 de julio 1387", 234324, "Ingenier�a en Mecatr�nica", 18, 40);
		if(estudy1.activarActor()) {
			System.out.println("Actor Estudiante Activo");
			}
			else {
				System.out.println("Actor Estudiante Inactivo");
			}
		System.out.println(estudy1.informarQueEs());
		System.out.println(estudy1.saludar());
		System.out.println(estudy1.aprender());
		System.out.println(estudy1.toString());
		
		//estudy1.CalcularPorcentaje();
		System.out.println(estudy1.informarPorcentaje());
		estudy1.aprobarMateria();
		System.out.println(estudy1.getMateriasAprobadas());
		System.out.println(estudy1.informarPorcentaje());
		//System.out.println("Porcentaje con la funcion calculaPorcentaje es : " + estudy1.calcularPorcentaje());
		estudy1.aprobarMateria();
		estudy1.aprobarMateria();
		estudy1.aprobarMateria();
		System.out.println(estudy1.getMateriasAprobadas());
		System.out.println(estudy1.informarPorcentaje());
		
		System.out.println(estudy1.toString());
		
		//profesor
		System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("PROFESOR");
		Profesor profe1 = new Profesor();
		profe1.setDni(54654);
		profe1.setNombre("Carlos");
		profe1.setApellido("Flores");
		profe1.setEdad(45);
		profe1.setDireccion("Las Tacureas 267");
		profe1.setSueldoBasico(20000);
		profe1.setAntiguedad(10);
		ArrayList<String> listadoMaterias = new ArrayList<>();
		profe1.setListaDeMaterias(listadoMaterias);
		System.out.println("Las Cantidad de materias agregadas es "+profe1.informarCantMaterias());
		profe1.setTitulo("Profesorado de Historia");
		profe1.agregarMateria("Historia Argentina");
		profe1.agregarMateria("Historia Hispanoamericana");
		profe1.agregarMateria("Histtoria Europea");
		profe1.agregarMateria("PreHistoria");
		profe1.agregarMateria("Ciencia Sociales");
		System.out.println();
		System.out.println("Despues de agregar materias");
		System.out.println("Las Cantidad de materias agregadas es "+profe1.informarCantMaterias());
		System.out.println(profe1.enseniar());
		System.out.println(profe1.toString());
		System.out.println("El sueldo de "+ profe1.nombre+ " "+profe1.apellido+ " "+"es $"+profe1.calcularSueldo());
		mostrame("");
		mostrame("despues de calcular sueldo");
		System.out.println(profe1.toString());
		
		//mostrame(profe1.toString());
		//mostrame(listadoMaterias);
		//mostrame(profe1.toString());
		
		//Arbusto
		System.out.println();System.out.println();
		System.out.println("**********************************");
		mostrame("ARBUSTO");
		Arbusto arbust1 = new Arbusto(true, "Ar�ndano", "Las flores individuales son peque�as, axilares", "fibrosas, finas y carentes de pelos absorbentes", "peque�o tallo subterr�neo, recto, cuadrangular y muy ramificado", 
				"hojas simples, alternas, con forma el�ptico-lanceoladas, m�rgenes dentados y peciolo corto", "Lowbush", 0.8f);
		arbust1.setCantDeRamitas(259);
		mostrame(arbust1.activarActor());
		mostrame(arbust1.informarQueEs());
		mostrame(arbust1.saludosDeArbusto());
		mostrame(arbust1.toString());
		
		//vegetal //casteo de Arbusto
		System.out.println();System.out.println();
		System.out.println("**********************************");
		mostrame("VEGETAL -- ARBUSTO");
		Vegetal veget1= (Vegetal) arbust1;
		mostrame(veget1.realizarFotosintesis());
		mostrame(veget1.reproducirse());
		mostrame(veget1.respirar());
		mostrame(veget1.darSombra());
		mostrame(veget1.devuelveOxigeno());
		mostrame(veget1.toString());

		
		//arbol
		System.out.println();System.out.println();
		System.out.println("**********************************");
		mostrame("ARBOL");
		Arbol arb1= new Arbol(false, "Tejo", "Las flores son axilares y aparecen en la Primavera", "Se dice que las ra�ces del tejo crecen directamente de las ramas", "es el gran grosor", 
				"hojas finas y puntiagudas", "tax�ceas", 17.0f,"�rboles con�feros, es piramidal con abundantes ramas");
		mostrame(arb1.activarActor());
		mostrame(arb1.informarQueEs());
		mostrame(arb1.saludosDeArbol());
                                    System.out.println("**********************************");
		mostrame("VEGETAL -- ARBOL");
		mostrame(arb1.realizarFotosintesis());
		mostrame(arb1.reproducirse());
		mostrame(arb1.respirar());
		mostrame(arb1.darSombra());
		mostrame(arb1.devuelveOxigeno());
		mostrame(arb1.toString());
		
		
		//vehiculo
		System.out.println();System.out.println();
		System.out.println("**********************************");
		mostrame("VEHICULO");
		Vehiculo vehicu1 = new Vehiculo("tito", 2020, "negro","RENAULT", "DUSTER OROCH", 4);
		vehicu1.setCantidadDeRuedas(4);
		mostrame("to String Antes de hacer metodos");
		mostrame(vehicu1.toString());
		mostrame(vehicu1.informarInerte());
		mostrame(vehicu1.informarTipoInerte());
		
		mostrame(vehicu1.informarQueEs());
		mostrame(vehicu1.activarActor());
		
		vehicu1.setVelocidad(50.56f);
		vehicu1.acelerar(); vehicu1.acelerar();
		mostrame("velocidad despues de acelerar 2 veces");
		mostrame(vehicu1.informarVelocidadActual());
		vehicu1.frenar(); vehicu1.frenar();
		mostrame("velocidad despues de frenar 2 veces");
		mostrame(vehicu1.informarVelocidadActual());
		
		mostrame("despues de ocupar un asiento");
		vehicu1.ocuparAsiento();
		mostrame("Asientos disponibles = "+vehicu1.asientosDisponibles);
		mostrame("Asientos ocupados = "+vehicu1.getAsientosOcupados());
		mostrame("despues de ocupar los 3 asientos disponible y 1");
		vehicu1.ocuparAsiento();vehicu1.ocuparAsiento();vehicu1.ocuparAsiento();
		mostrame("Asientos disponibles = "+vehicu1.asientosDisponibles);
		mostrame("Asientos ocupados = "+vehicu1.getAsientosOcupados());
		vehicu1.ocuparAsiento();
		mostrame("despues de desocupar un asiento");
		vehicu1.desocuparAsiento();
		mostrame("Asientos disponibles = "+vehicu1.asientosDisponibles);
		mostrame("Asientos ocupados = "+vehicu1.getAsientosOcupados());
		
		mostrame("to String despues de  hacer metodos");
		mostrame(vehicu1.toString());
		
		//bicicleta
		System.out.println();System.out.println();
		System.out.println("**********************************");
		mostrame("BICICLETA");
		Bicicleta bici = new Bicicleta("Jacinto", 2, 2016, "azul", "Aurora", "XLP-21", 20f, 1, 0, 1, 3, 4);
		mostrame(bici.informarVelocidadActual());
		bici.acelerar();
		bici.frenar();
		bici.cambiarPinion(5);
		bici.cambiarPlato(2);
		bici.informarEstadoActual();
		mostrame(bici.toString());
		
		//coche
		System.out.println();System.out.println();
		System.out.println("**********************************");
		mostrame("COCHE");
		Coche auto = new Coche();
		auto.setAnio(2019); auto.setAsientos(4); auto.setAsientosDisponibles(2);
		auto.setAsientosOcupados(2);auto.setCantDepuertas(5);auto.setCantidadDeRuedas(4);
		auto.setColor("Rojo"); auto.setDuenio("Fredo Codo Fredo");auto.setMarca("VOLKSWAGEN");
		auto.setModelo("GOLF"); auto.setMotor("TSI de 2.0 litros");auto.setTipoCombustible("gasolina");
		auto.setVelocidad(60f);auto.setVelocidadMaxima(246f);
		
		mostrame(auto.medirAceite());
		mostrame(auto.informarFaltaCombustible());
		
		mostrame(auto.informarVelocidadActual());
		auto.acelerar();auto.acelerar();
		auto.frenar();
		mostrame(auto.informarVelocidadActual());
		
		mostrame(auto);
		mostrame(" ");
		mostrame("**********************************");
		mostrame("**                              **");
		mostrame("**            FIN               **");
		mostrame("**                              **");
		mostrame("**********************************");
	}
	public static void mostrame(Object cualquierCosa) {
		System.out.println(cualquierCosa);
	}
}
