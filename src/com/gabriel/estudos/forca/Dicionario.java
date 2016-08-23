package com.gabriel.estudos.forca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dicionario {
	List<Palavra> palavras;

	public Dicionario() {
		this.palavras = new ArrayList<Palavra>();
		/*
		 * populando o dicionario com várias palavras
		 * Populating the dictionary with lots of words
		 */
		this.addPalavra(new Palavra("objeto"));
		this.addPalavra(new Palavra("coisa"));
		this.addPalavra(new Palavra("casa"));
		this.addPalavra(new Palavra("carro"));
		this.addPalavra(new Palavra("avião"));
		this.addPalavra(new Palavra("moto"));
		this.addPalavra(new Palavra("classe"));
		this.addPalavra(new Palavra("apartamento"));
		this.addPalavra(new Palavra("gibi"));
		this.addPalavra(new Palavra("java"));
		this.addPalavra(new Palavra("dicionario"));
		this.addPalavra(new Palavra("sensacional"));
		this.addPalavra(new Palavra("pagina"));
		this.addPalavra(new Palavra("web"));
		this.addPalavra(new Palavra("programacao"));
		this.addPalavra(new Palavra("divino"));
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
	//Sort
	public Palavra Sortear(){
		Random r = new Random();
		int indice = r.nextInt(this.Tamanho());
		Palavra palavraSorteada = this.getPalavras().get(indice);
		return palavraSorteada;
	}
	/*
	 * Overriding toString() method to make it print correctly(non-Javadoc)
	 * Override método toString() para imprimir corretamente
	 */

	@Override
	public String toString(){
		String m = "Palavras: ";
		for(Palavra palavra: palavras){
			m = m + "\n " + palavra.getCorpo();
		}
		return m;
		
	}
	
}
