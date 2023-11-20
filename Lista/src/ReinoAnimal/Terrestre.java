package ReinoAnimal;

import java.time.LocalDate;

public class Terrestre extends Animal {

	public Terrestre(String especie, String sexo, LocalDate dataNascimento, String regiao, Boolean pelo) {
		super(especie, sexo, dataNascimento);

		setRegiao(regiao);
		setPelo(pelo);
	}
	
	private String regiao;
	private Boolean pelo;
	
	public void mover() {
		System.out.println("O animal etá se movendo");
	}

	public void comer() {
		System.out.println("O animal terrestre está comendo…");
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Boolean getPelo() {
		return pelo;
	}

	public void setPelo(Boolean pelo) {
		this.pelo = pelo;
	}
}
