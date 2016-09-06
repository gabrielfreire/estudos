package com.gabriel.estudos.webinar03.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Funcionario> funcionarios;

	public Empresa() {
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void adicionarFuncionario(Funcionario newFunc){
		this.funcionarios.add(newFunc);
	}
	
	public Funcionario procurarFuncionario(String nome){
		Funcionario funcionario = null;
		boolean achou = true;
		for(Funcionario f: this.funcionarios){

			if(f.existeNome(nome)){
				achou = true;
				funcionario = f;
				return funcionario;
			}else{
				achou = false;
			}

			
		}
		if(!achou){
			System.out.println("Funcionário não encontrado!");
			return null;	
		}
		return null;
		
		
	}
	
	@Override
	public String toString(){
		String m = "Funcionários: \n";
		int count = 1;
		for(Funcionario f: this.funcionarios){
			String nome = f.getNome();
			m += count + " - " + nome + "\n";
			count++;
		}
		return m;
	}
	
	

}
