package com.gabriel.estudos.exercicios.webinar02exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		
		
		/*
		 * Cria��o de Empresa e funcion�rios
		 * para Empresa
		 */
		//criar empresa
		Empresa novaEmpresa = new Empresa();
		
		System.out.println("*****CRIA��O DE FUNCIONARIOS NA EMPRESA****");
		//criando um Gerente na novaEmpresa
		novaEmpresa.criarFuncionario(1, "Gabriel Freire", 25);
		//criando um Analista na novaEmpresa
		System.out.println("-------------------");
		novaEmpresa.criarFuncionario(2, "Miguel", 22);
		
		System.out.println("****************************************************");
		/*
		 * Cria��o direta
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
		
		
		//testando condi��o
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
		System.out.println("O sal�rio total de " + gabriel.getNome() + " �: R$" + gabriel.calcularSalario());
		
		System.out.println("************ANALISTA**************");
		System.out.println(rodrigo.mostrarDados());
		System.out.println("O sal�rio total de " + rodrigo.getNome() + " �: R$" + rodrigo.calcularSalario());
		
		System.out.println("*************GERENTE*************");
		System.out.println(miguel.mostrarDados());
		System.out.println("O sal�rio total de " + miguel.getNome() + " �: R$" + miguel.calcularSalario());

	}

}
