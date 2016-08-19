package com.gabriel.estudos;

import java.util.Random;
import java.util.Scanner;

public class Dados {

	public static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws Exception {


		int[] dados = {0, 1, 2, 3, 4, 5, 6};
		
		Random r = new Random();
		int indiceDado = r.nextInt(7);
		int numDoDado = dados[indiceDado];
		
		
		System.out.println("O dado foi rolado!!! qual número caiu? dê um palpite: ");
		//Recebe o valor do usuário e checa se o mesmo digitou um número inteiro
		try{
			Integer palpite = scan.nextInt();
			if(palpite instanceof Integer){
				if(palpite > 6){
					System.out.println("O dado só possui valores até 6!");
					
				}else if(numDoDado == palpite){
					System.out.println("Parabéns, você acertou! o número do dado foi: " + numDoDado);
				}else{
					System.out.println("Você errou! O número foi: " + numDoDado);
				}
				
			}
			
		}catch(Exception e){ //lança uma exceção caso o usuário não digitar um número inteiro
			throw new Exception("Você não digitou um número! Por favor, digite um número inteiro!");
			
		}
	}
}
