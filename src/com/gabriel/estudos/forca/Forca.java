package com.gabriel.estudos.forca;

import java.util.Scanner;

public class Forca {
	/*
	 * O dicion�rio � populado em seu construtor, por tanto, no momento de sua cria��o
	 * The dictionary is populated in its constructor, therefore, at the moment of its creation
	 */
	public static Dicionario dic = new Dicionario(); 
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Iniciar(); //M�todo que inicia o jogo da Forca


	}
	
	/*
	 * No m�todo iniciar se encontra toda l�gica do jogo
	 * Method to start the game, where all its the logic can be found
	 */
	public static void Iniciar(){
		//M�ximo de 5 chances para acertar
		//Maximum of 5 chances to loose
		int chances = 5;
		Palavra objPalavra = dic.Sortear(); //Objeto palavra
		String palavra = objPalavra.getCorpo(); //String palavra
		//linhas das letras da palavra
		Palavra underlines = objPalavra.criarUnderlines();
		
		
		//Enquanto tiver chances, continue perguntando 
		//While there is a chance the game keeps asking
		while(chances != 0){
			
			System.out.println("Bem-vindo ao Forca!");
			
			System.out.println("Qual a palavra? Voc� tem "+ chances +" chances");
			
			System.out.println(underlines.toString());
			
			System.out.print("Digite uma letra: ");
			
			String letra = scan.nextLine();
			
			//Condi��o para checar se nesta palavra existe a letra informada
			//Condition to check if in the word there is the inputed letter
			if(palavra.contains(letra)){
				//Se existir, trocar  '_' por letra
				//If true, change '_' to the letter
				System.out.println("Parab�ns, voc� acertou!");
				
				for(int i = 0; i < palavra.length(); i++){
					if(palavra.charAt(i) == letra.charAt(0)){

						underlines.substituir(i, letra);
						
					}
	
				}

				//se a palavra estiver completa, o jogo acaba e o jogador vence!
				//If the player completes the word the game ends and the player wins
				if(underlines.estaCompleta()){
					
					System.out.println(underlines);
					
					System.out.println("Parab�ns, voc� acertou. A palavra �: " + objPalavra.toString().toUpperCase());
					
					Vitoria();
					
				}
				//se n�o existir, informar ao usu�rio que o mesmo errou!
				//if not, output that the player chose wrong letter
			}else{
				
				System.out.println("Voc� errou!");
				
				chances--; //elimina uma chance sempre que o jogador escolhe uma letra errada | remove one chance everytime the player choose a wrong letter
				
			}
		}
		
		
		GameOver();
	}
	/*
	 * Game Over Method
	 * M�todo para Game Over
	 */
	public static void GameOver(){
		System.out.println("Voc� n�o conseguiu! GAME OVER!"); //informa que o jogador foi vitorioso
	}
	/*
	 * M�todo de vit�ria para sair do jogo
	 * Method called when the player wins, exit the game
	 */
	public static void Vitoria(){
		System.exit(1);;
	}


}
