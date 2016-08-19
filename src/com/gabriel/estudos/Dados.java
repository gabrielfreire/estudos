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
		
		
		System.out.println("O dado foi rolado!!! qual n�mero caiu? d� um palpite: ");
		//Recebe o valor do usu�rio e checa se o mesmo digitou um n�mero inteiro
		try{
			Integer palpite = scan.nextInt();
			if(palpite instanceof Integer){
				if(palpite > 6){
					System.out.println("O dado s� possui valores at� 6!");
					
				}else if(numDoDado == palpite){
					System.out.println("Parab�ns, voc� acertou! o n�mero do dado foi: " + numDoDado);
				}else{
					System.out.println("Voc� errou! O n�mero foi: " + numDoDado);
				}
				
			}
			
		}catch(Exception e){ //lan�a uma exce��o caso o usu�rio n�o digitar um n�mero inteiro
			throw new Exception("Voc� n�o digitou um n�mero! Por favor, digite um n�mero inteiro!");
			
		}
	}
}
