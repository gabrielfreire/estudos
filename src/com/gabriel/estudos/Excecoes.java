package com.gabriel.estudos;

import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {


		int x = getInt();
		int y = getInt();
		//treating an Unchecked exception
		try{
			int result = x / y;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Este número é indivisível por 0");
		}
		
		
	}
	public static int getInt(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		return scan.nextInt();
		
	}

}
