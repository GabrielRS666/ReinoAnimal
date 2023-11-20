package ReinoAnimal;

import java.time.LocalDate;

public class Aquatico extends Animal{

	public Aquatico(String especie, String sexo, LocalDate dataNascimento, String aguas, Boolean escamas) {
		super(especie, sexo, dataNascimento);
		
		setAguas(aguas);
		setEscamas(escamas);		
	}

	private String aguas;
	private Boolean escamas;
	
	public void nadar() {
		System.out.println("O animal está nadando");
	}
	
	public void comer() {
		System.out.println("O animal aquático está comendo…");
	}

	public String getAguas() {
		return aguas;
	}

	public void setAguas(String aguas) {
		this.aguas = aguas;
	}

	public Boolean getEscamas() {
		return escamas;
	}

	public void setEscamas(Boolean escamas) {
		this.escamas = escamas;
	}
}
