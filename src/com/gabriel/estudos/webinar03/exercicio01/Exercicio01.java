package com.gabriel.estudos.webinar03.exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		
		emp.adicionarFuncionario(new Funcionario("Gabriel"));
		emp.adicionarFuncionario(new Funcionario("Rafael"));
		emp.adicionarFuncionario(new Funcionario("Miguel"));
		
		System.out.println(emp.toString());
		
		System.out.println(emp.procurarFuncionario("Rafael"));
		System.out.println(emp.procurarFuncionario("Daniel"));
		System.out.println(emp.procurarFuncionario("Rodrigo"));
		System.out.println(emp.procurarFuncionario("Gabriel"));
	}

}
