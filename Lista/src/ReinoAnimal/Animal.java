package ReinoAnimal;

import java.time.LocalDate;

public class Animal {
	
	private String especie;
	private String sexo;
	private LocalDate dataNascimento;
	private int contador;
	
	public Animal( String especie, String sexo, LocalDate dataNascimento) {
		setEspecie(especie);
		setSexo(sexo);
		setDataNascimento(dataNascimento);	
		setContador();
		
	}
	
	public void comer() {
		System.out.println("O animal está comendo");
	
	}
	
	public void perfil() {
		
	}


	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getContador() {
		return contador;
	}

	public void setContador() {
		this.contador+=1;
	}

	public String getEspecie() {
		return especie;
	}
	

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
}
	
