package com.gabriel.estudos.forca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dicionario {
	List<Palavra> palavras;

	public Dicionario() {
		this.palavras = new ArrayList<Palavra>();
	}

	public List<Palavra> getPalavras() {
		return palavras;
	}

	public void setPalavras(List<Palavra> palavras) {
		this.palavras = palavras;
	}
	
	public void addPalavra(Palavra palavra){
		this.palavras.add(palavra);
	}
	
	public int Tamanho(){
		return palavras.size();
	}
	
	public Palavra Sortear(){
		Random r = new Random();
		int indice = r.nextInt(this.Tamanho());
		Palavra palavraSorteada = this.getPalavras().get(indice);
		return palavraSorteada;
	}
	
	@Override
	public String toString(){
		String m = "Palavras: ";
		for(Palavra palavra: palavras){
			m = m + "\n " + palavra.getCorpo();
		}
		return m;
		
	}
	
}
