package com.gabriel.estudos;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual seu sexo?");
		String sexo = scan.nextLine();
		
		switch(sexo){
			case "M":	
			case "m":
				System.out.println("Voc� � maxo mesmo!!");
				break;
			case "F":
			case "f":
				System.out.println("Voc� � mulher!");
				break;
			default:
				System.out.println("Voc� precisa informar seu sexo!");
				break;
		}
		
	}

}
