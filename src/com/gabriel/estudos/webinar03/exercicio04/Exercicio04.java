package com.gabriel.estudos.webinar03.exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		Numeros nums = new Numeros(new GeradorNumericoSequencial());
		Numeros nums2 = new Numeros(new GeradorNumericoRandomico());
		int[] nu = nums.gerar(10);
		int[] nu2 = nums2.gerar(10);
		for(int i = 0; i < nu.length; i++){
			System.out.print(nu[i] + ", ");
			
		}
		System.out.println("\n********************--------------------***********************");
		for(int i = 0; i < nu2.length; i++){
			System.out.print(nu2[i] + ", ");
		}

	}

}
