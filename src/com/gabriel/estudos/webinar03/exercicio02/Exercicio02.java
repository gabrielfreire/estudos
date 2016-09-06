package com.gabriel.estudos.webinar03.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {

	public static void main(String[] args) {
		
		List<Integer> lista01 = new ArrayList<Integer>();
		List<Integer> listaImpar = new ArrayList<Integer>();
		List<Integer> listaPar = new ArrayList<Integer>();
		
		lista01.add(8);
		lista01.add(3);
		lista01.add(1);
		lista01.add(4);
		lista01.add(2);
		lista01.add(6);
		lista01.add(0);
		lista01.add(5);
		lista01.add(7);
		lista01.add(9);
		
		System.out.println("Lista 01: " + lista01);
		
		for(int i: lista01){
			if(i % 2 == 0){
				listaPar.add(i);
			}else{
				listaImpar.add(i);
			}
		}
		System.out.println("*****************************");
		System.out.println("Lista de Impares: " + listaImpar);
		System.out.println("Lista de Pares: " + listaPar);
		
	}

}
