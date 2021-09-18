package practica;

public interface Actor {
String SERVIVO= "Es un ser vivo";
String MAQUINA= "Es una maquina";
boolean ACTIVO= true;
boolean INACTIVO= false;
String informarQueEs();
boolean activarActor();
boolean desactivarActor();

}
