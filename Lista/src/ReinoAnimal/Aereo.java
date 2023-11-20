package ReinoAnimal;

import java.time.LocalDate;

public class Aereo extends Animal{

	public Aereo(String especie, String sexo, LocalDate dataNascimento) {
		super(especie, sexo, dataNascimento);
		
	}
	
	private int altitude;
	
	public void voar() {
		System.out.println("O animal está voando…");
	}
	
	public void comer() {
		System.out.println("O animal está comendo…");
	}
	
	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}


}
