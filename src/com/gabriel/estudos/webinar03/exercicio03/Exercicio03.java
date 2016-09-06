package com.gabriel.estudos.webinar03.exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		Veterinario vet = new Veterinario();
		Papagaio papagaio = new Papagaio();
		Leao leao = new Leao();
		
		System.out.println(vet.curar(papagaio));
		System.out.println(vet.curar(leao));
		

	}

}
