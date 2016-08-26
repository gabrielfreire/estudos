package com.gabriel.estudos.exercicios.webinar02exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		
		
		/*
		 * Criação de Empresa e funcionários
		 * para Empresa
		 */
		//criar empresa
		Empresa novaEmpresa = new Empresa();
		
		System.out.println("*****CRIAÇÃO DE FUNCIONARIOS NA EMPRESA****");
		//criando um Gerente na novaEmpresa
		novaEmpresa.criarFuncionario(1, "Gabriel Freire", 25);
		//criando um Analista na novaEmpresa
		System.out.println("-------------------");
		novaEmpresa.criarFuncionario(2, "Miguel", 22);
		
		System.out.println("****************************************************");
		/*
		 * Criação direta
		 * de Funcionarios
		 * Analistas e Gerentes
		 */
		//criar funcionario
		Funcionario gabriel = new Funcionario("Gabriel Freire");
		//criar analista
		Analista rodrigo = new Analista("Rodrigo");
		//criar gerente
		Gerente miguel = new Gerente("Miguel", 35);
		
		rodrigo.setSetor("Suporte");
		rodrigo.setHorasTrabPorMes(160);
		rodrigo.setSalarioPorHora(10.0);
		
		miguel.setBonus(140);
		miguel.setHorasTrabPorMes(160);
		miguel.setSalarioPorHora(25.0);
		
		
		//testando condição
		gabriel.setHorasTrabPorMes(180);
		gabriel.setSalarioPorHora(9.15);
		
		//mostrando na tela
		System.out.println(gabriel.mostrarDados());
		
		//setando dados corretamente
		gabriel.setHorasTrabPorMes(160);
		gabriel.setSalarioPorHora(12.20);
		
		//mostrando na tela novamente
		System.out.println("**********FUNCIONARIO*************");
		
		System.out.println(gabriel.mostrarDados());
		System.out.println("O salário total de " + gabriel.getNome() + " é: R$" + gabriel.calcularSalario());
		
		System.out.println("************ANALISTA**************");
		System.out.println(rodrigo.mostrarDados());
		System.out.println("O salário total de " + rodrigo.getNome() + " é: R$" + rodrigo.calcularSalario());
		
		System.out.println("*************GERENTE*************");
		System.out.println(miguel.mostrarDados());
		System.out.println("O salário total de " + miguel.getNome() + " é: R$" + miguel.calcularSalario());

	}

}
