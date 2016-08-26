package com.gabriel.estudos.exercicios.webinar02exercicio;

public class Empresa {
	
	private Funcionario funcionario;
	
	private final static int GERENTE = 1;
	private final static int ANALISTA = 2;
	
	public Empresa(){
		
		
	}
	
	public Funcionario criarFuncionario(int tipo, String nome, int idade){
		if(tipo == GERENTE){
			this.funcionario = new Gerente(nome, idade);
			Gerente gerente = (Gerente) this.funcionario;
			gerente.setHorasTrabPorMes(160);
			gerente.setSalarioPorHora(25);
			gerente.setBonus(140);
			
			System.out.println("Foi criado um Gerente para esta empresa!");
			System.out.println(gerente.mostrarDados());
			return gerente;
		}else if(tipo == ANALISTA){
			this.funcionario = new Analista(nome, idade);
			Analista analista = (Analista) this.funcionario;
			analista.setHorasTrabPorMes(160);
			analista.setSalarioPorHora(12);
			analista.setSetor("Serviços");
			System.out.println("Foi criado um Analista para esta empresa!");
			System.out.println(analista.mostrarDados());
			return analista;
		}
		return null;
	}

}
