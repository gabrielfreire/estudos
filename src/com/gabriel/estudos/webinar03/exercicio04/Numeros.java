package com.gabriel.estudos.webinar03.exercicio04;

public class Numeros {

	private GeradorNumerico gerador;
	
	public Numeros(GeradorNumerico ger){
		this.gerador = ger;
	}
	
	public int[] gerar(int qtdade){
		int[] nums = new int[qtdade];
		
		for(int i = 0; i < qtdade; i++){
			nums[i] = this.gerador.proximo();
		}
	
		return nums;
	}
	
	
}
