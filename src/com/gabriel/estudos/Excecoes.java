package com.gabriel.estudos;

import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {

		//any variable defined inside try{} block isn't available in catch/finally blocks
		//the variable must be defined outside the try{} block
		int x = getInt();
		int y = getInt();
		int result= 999;
		//treating an Unchecked exception
		/*
		 * Unchecked exceptions are exceptions that we don't need to treat because they are unexpected RuntimeExceptions
		 * Checked exceptions are exceptions that we need to treat because they are expected and ugly, so we have to show nice error messages
		 * Throwables are the same as Errors
		 */
		try{
			
			result = x / y;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Este número é indivisível por 0");
			System.out.println("ERRO: " + e.getMessage());
			System.out.println(result);
		}
		
		
	}
	public static int getInt(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		return scan.nextInt();
		
	}

}
