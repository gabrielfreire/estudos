package com.gabriel.estudos;

import java.util.ArrayList;
import java.util.Random;

public class CartasUsandoArrayList {

	public static void main(String[] args) {
		//declarando o ArrayList
		ArrayList<String> faces = new ArrayList<>();
		ArrayList<String> nipes = new ArrayList<>();
		
		//preenchendo as faces
		faces.add("A");
		faces.add("2");
		faces.add("3");
		faces.add("4");
		faces.add("5");
		faces.add("6");
		faces.add("7");
		faces.add("8");
		faces.add("9");
		faces.add("10");
		faces.add("J");
		faces.add("Q");
		faces.add("K");
		//preenchendo os nipes
		nipes.add("Espadas");
		nipes.add("Paus");
		nipes.add("Copas");
		
		//tirando indices randomicos
		Random r = new Random();
		int indiceFaces = r.nextInt(10);
		int indiceNipes = r.nextInt(3);
		
		String face = faces.get(indiceFaces);
		String nipe = nipes.get(indiceNipes);
		//imprimindo aplicação
		System.out.println("Combinações possíveis");
		System.out.println("-------------");
		System.out.println(faces.toString());
		System.out.println(nipes.toString());
		System.out.println("-----------------");
		System.out.println("Você tirou: " + face + " " + nipe);
		//testando contains();
		System.out.println("A Lista de faces tem a face A? \n" + faces.contains("A"));
		System.out.println("A Lista de nipes tem o nipe Espadas? \n" + nipes.contains("Espadas"));
		
		
	}

}
