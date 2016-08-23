package com.gabriel.estudos.forca;

import java.util.Scanner;

public class Forca {
	public static Dicionario dic = new Dicionario();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int chances = 5;
		int count = 1;
		int tamanhoLista = dic.Tamanho();
		dic.addPalavra(new Palavra("objeto"));
		dic.addPalavra(new Palavra("coisa"));
		dic.addPalavra(new Palavra("casa"));
		dic.addPalavra(new Palavra("carro"));
		dic.addPalavra(new Palavra("avi�o"));
		dic.addPalavra(new Palavra("moto"));
		dic.addPalavra(new Palavra("classe"));
		dic.addPalavra(new Palavra("apartamento"));
		dic.addPalavra(new Palavra("gibi"));
		dic.addPalavra(new Palavra("java"));
		dic.addPalavra(new Palavra("dicionario"));
		dic.addPalavra(new Palavra("sensacional"));
		dic.addPalavra(new Palavra("pagina"));
		dic.addPalavra(new Palavra("web"));
		dic.addPalavra(new Palavra("programacao"));
		dic.addPalavra(new Palavra("divino"));
		
		
		Iniciar();


	}
	
	
	public static void Iniciar(){
		//M�ximo de 5 chances para acertar
		int chances = 5;
		Palavra objPalavra = dic.Sortear(); //Objeto palavra
		String palavra = objPalavra.getCorpo(); //String palavra
		//linhas das letras da palavra
		Palavra underlines = objPalavra.criarUnderlines();
		int totalVezes = palavra.length();
		//Enquanto tiver chances, continue perguntando
		while(chances != 0){
			System.out.println("Bem-vindo ao Forca!");
			System.out.println("Qual a palavra? Voc� tem "+ chances +" chances");
			System.out.println(underlines.toString());
			//System.out.println(palavra.length());
			System.out.print("Digite uma letra: ");
			String letra = scan.nextLine();
			//Condi��o para checar se nesta palavra existe a letra informada
			if(palavra.contains(letra)){
				//Se existir, trocar  '_' por letra
				System.out.println("Parab�ns, voc� acertou!");
				
				for(int i = 0; i < palavra.length(); i++){
					if(palavra.charAt(i) == letra.charAt(0)){

						underlines.substituir(i, letra);
						
					}
					//tracos.append(" ");
				}
				//decrementar o totalVezes
				totalVezes--;
				//se o totalVezes for zero, o jogo acaba e o jogador vence!
				if(underlines.estaCompleta()){
					System.out.println(underlines);
					System.out.println("Parab�ns, voc� acertou. A palavra �: " + objPalavra.toString().toUpperCase());
					Vitoria();
				}
				//se n�o existir, informar ao usu�rio que o mesmo errou!
			}else{
				System.out.println("Voc� errou!");
				chances--;
			}
		}
		GameOver();
	}
	//Fun��o de GAME OVER
	public static void GameOver(){
		System.out.println("Voc� n�o conseguiu! GAME OVER!"); //informa que o jogador foi vitorioso
	}
	//Fun��o de vit�ria para sair do jogo
	public static void Vitoria(){
		System.exit(1);;
	}



}
