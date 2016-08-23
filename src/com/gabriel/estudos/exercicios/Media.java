package com.gabriel.estudos.exercicios;

public class Media {

	public static void main(String[] args) {
		

		double[] notas = {7.5, 8.5, 8.0, 9.5, 7.0};
		
		
		
		System.out.println(CalcularMedia(notas)); //8.1
		
	}
	public static double CalcularMedia(double[] n){
		double media = 0;
		double soma = 0;
		for(int i = 0; i < n.length; i++){
			soma += n[i];
			media = soma/n.length;			
		}

		return media;
	}

}
