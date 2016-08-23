package com.gabriel.estudos.exercicios;

public class Desafio {
	public static final double JUROS = 0.01;
	
	public static void main(String[] args) {
		
		double investimento = 5000.0;
		double valor = CalcularRendimento(investimento, 12);
		String valorFormatado = String.format("%.2f", valor);
		System.out.println("Investimento: " + "R$" + investimento + "\nRendimento em 1 ano: " + "R$" + valorFormatado);
	}
	
	public static double CalcularRendimento(double inv, int meses){
		double resultado = 0;
		
		resultado = (inv * Math.pow(1 + JUROS, meses));
		
		return resultado;
	}

}
