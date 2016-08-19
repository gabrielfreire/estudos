package com.gabriel.estudos;

import java.util.Random;
//Sorteia uma carta de baralho
public class Cartas {

	public static void main(String[] args) {


		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] naipes = {"Espadas", "Paus", "Copas", "Outros"};
		
		Random r = new Random();
		//faces
		int indice = r.nextInt(14);
		String face = faces[indice];
		
		
		//naipes
		int indiceNaipes = r.nextInt(4);
		String naipe = naipes[indiceNaipes];
		
		System.out.println(faces.length);
		System.out.println(face + " de " + naipe);

	}

}
