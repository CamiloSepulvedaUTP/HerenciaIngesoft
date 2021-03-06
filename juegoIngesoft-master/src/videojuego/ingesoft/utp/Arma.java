package videojuego.ingesoft.utp;

public class Arma extends Personaje {

	private Arma codArma;
	
	private Integer agilidad;
	
	private Integer fuerza;
	
	private Integer inteligencia;
	
	private Integer durabilidad;
	
	private boolean equipada;

	public Arma getCodArma() {
		return codArma;
	}

	public void setCodArma(Arma codArma) {
		this.codArma = codArma;
	}

	public Integer getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(Integer agilidad) {
		this.agilidad = agilidad;
	}

	public Integer getFuerza() {
		return fuerza;
	}

	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Integer getDurabilidad() {
		return durabilidad;
	}

	public void setDurabilidad(Integer durabilidad) {
		this.durabilidad = durabilidad;
	}

	public boolean isEquipada() {
		return equipada;
	}

	public void setEquipada(boolean equipada) {
		this.equipada = equipada;
	}
	
	
	
}
