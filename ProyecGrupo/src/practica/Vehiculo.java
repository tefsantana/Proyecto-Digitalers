package practica;



public class Vehiculo implements ObjetoInerte, Actor {
    protected String duenio;
    protected int cantRuedas;
    protected String color;
    protected String marca;
    protected int anio;
    protected String modelo;
    protected float velocidadActual;
    protected int asientos;
    protected int asientosDisponibles;
    protected int asientosOcupados;

    //contructores // sobre carga de contructores cuando hay mas de uno
    public Vehiculo() {

    };
    
    public Vehiculo(String duenio, int cantidadDeRuedas, int anio, String color, String marca, String modelo, float velocidad, int asientos, int asientosDisponibles, int asientosOcupados){
        this.duenio = duenio;
        this.cantRuedas = cantidadDeRuedas;
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.velocidadActual = velocidad;
        this.asientos = asientos;
        this.asientosDisponibles = asientosDisponibles;
        this.asientosOcupados = asientosOcupados;
    }

    public Vehiculo(String duenio, int anio, String color, String marca, String modelo, int asientos){
        this.duenio = duenio;
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.asientos = asientos;
        this.asientosDisponibles = asientos;
        this.asientosOcupados = 0;
    }
    
   
    //Set y Get
    public float getVelocidad() {
        return velocidadActual;
    }

    public void setVelocidad(float velocidad) {
        this.velocidadActual = velocidad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int cantidadDeRuedas() {
        return cantRuedas;
    }

    public void setCantidadDeRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    
    public String getDuenio() {
        return duenio;
    }
    
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAsientos() {
        return asientos;
    }
    
    public void setAsientos (int asientos) {
        this.asientos = asientos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
    
    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }
    
    public void setAsientosOcupados (int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    // to String
    @Override
    public String toString() {
	    return "Vehiculo"+"\n "+" Duenio = " + duenio +"\n "+ " cantidad de ruedas = " + cantRuedas +"\n "+
    " color = " + color +"\n "+ " marca = " + marca +"\n "+ " a�o = " + anio +"\n "+ " modelo = " + modelo +"\n "+
	" velocidad = " + velocidadActual+ "KM/h" +"\n "+ " asientos = " + asientos +"\n "+ " asientos disponibles = " + asientosDisponibles +"\n "+
    " asientos ocupados = " + asientosOcupados;
    }
    

    //metodos de la interfaz
    @Override
    public boolean esInerte() {
            return true;
    }

    @Override
    public boolean esNatural() {
            return false;
    }

    @Override
    public boolean esArtificial() {
        return true;
    }

    @Override
	public String informarInerte() {
		return "El vehivulo es ---> "+Vehiculo.INERTE;
	}

    @Override
	public String informarTipoInerte() {
		return "El vehiculo es ---> "+Vehiculo.INERTEARTIFICIAL;
	}

	
//metodos de la interfaz ACTOR
    @Override
    public String informarQueEs() {
	    return MAQUINA;
    }
    @Override
    public boolean activarActor() {
	    return Vehiculo.ACTIVO;
	}
    @Override
    public boolean desactivarActor() {
        return Vehiculo.INACTIVO;
    }
   
 
    public String informarVelocidadActual() {
        return("La velocidad actual es " + velocidadActual + "KM/h");
    }
    public void acelerar() {
    	velocidadActual*=2;
            
    };
    
    public void frenar() {
        velocidadActual/=2;
        }
    
    public boolean disponibilidad() {
        if (this.asientosDisponibles > 0 ){
            return true;
        }
        else {
        	return false;
        }
    }

    public void ocuparAsiento() {
	if(this.disponibilidad()) {
		this.asientosOcupados ++;
		this.asientosDisponibles --;
	}else {
		System.out.println("No posee más asientos disponibles");
	}
			
    }
    
    public void desocuparAsiento() {
	if(this.asientosOcupados > 0 ) {
		this.asientosOcupados --;
		this.asientosDisponibles ++;
	}else {
		System.out.println("tiene todos los asientos disponibles");
	}
			
    }

}
