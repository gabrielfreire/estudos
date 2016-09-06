package com.gabriel.estudos.webinar03.exercicio01;

public class Funcionario {
	private String nome;
	
	public Funcionario(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean existeNome(String nome){
		if(this.getNome() == nome){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public String toString(){
		return "Funcionario: " + this.nome;
	}

}
