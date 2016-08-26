package com.gabriel.estudos.exercicios.webinar02exercicio;

public class Funcionario {
	
	private String nome;
	
	private int idade;
	
	private double salarioPorHora;
	
	private int horasTrabPorMes;
	
	public Funcionario(String nome, int idade) {
		
		this.nome = nome;
		
		this.idade = idade;
	
	}
	
	public Funcionario(String nome){
		
		this.nome = nome;
		
		this.idade = 18;
	
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		if(salarioPorHora < 10 || salarioPorHora > 200){
			System.out.println("ERRO! O Salário por hora deve estar entre 10 e 200!");
			this.salarioPorHora = 0.0;
		}else{
			this.salarioPorHora = salarioPorHora;
		}
		
	}

	public int getHorasTrabPorMes() {
		
		return horasTrabPorMes;
	}

	public void setHorasTrabPorMes(int horasTrabPorMes) {
		
		if(horasTrabPorMes > 160){
			System.out.println("ERRO! 160h por mês é o máximo permitido.");
			this.horasTrabPorMes = 0;
		}else{
			this.horasTrabPorMes = horasTrabPorMes;	
		}
		
	}
	
	public String mostrarDados(){
		String m = "Nome: "
					+ this.nome +
					"\nIdade: " + this.idade +
					"\nSalário por hora: R$" + this.salarioPorHora +
					"\nHoras Trabalhadas por Mês: " + this.horasTrabPorMes + "hrs";
		
		return m;
	}
	
	public double calcularSalario(){
		double horasTrab = (double) this.horasTrabPorMes;
		double salHora = this.salarioPorHora;
		double salario = salHora * horasTrab;
		
		return salario;
	}

}
