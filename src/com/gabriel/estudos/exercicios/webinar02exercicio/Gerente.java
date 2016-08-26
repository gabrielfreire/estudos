package com.gabriel.estudos.exercicios.webinar02exercicio;

public class Gerente extends Funcionario{
	
	private double bonus;
	
	public Gerente(String nome) {
		super(nome);
	}
	public Gerente(String nome, int idade){
		super(nome, idade);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		double salDoFuncionario = super.calcularSalario();
		double bonusDoGerente = this.bonus;
		
		double salarioDoGerente = salDoFuncionario + bonusDoGerente;
		
		return salarioDoGerente;
	}
	
	@Override
	public String mostrarDados() {
	
		return super.mostrarDados() + "\nBonus: R$" + this.bonus;
	}
	
	

}
