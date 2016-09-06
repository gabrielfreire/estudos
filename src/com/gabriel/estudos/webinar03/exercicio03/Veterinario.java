package com.gabriel.estudos.webinar03.exercicio03;

public class Veterinario {
	
	

	public Veterinario() {
		super();
	}
	
	public String curar(Animal animal){
		if(animal instanceof Leao){
			return animal.emitirSom();
		}else if(animal instanceof Papagaio){
			return animal.emitirSom();
		}else{
			return "Animal não existe";
		}
	}

}
