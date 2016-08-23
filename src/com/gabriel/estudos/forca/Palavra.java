package com.gabriel.estudos.forca;

public class Palavra {

	private String corpo;
	
	public Palavra(String corpo){
		this.corpo = corpo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	
	public Palavra criarUnderlines(){
		String palavra = "";
		Palavra m = new Palavra(palavra);
		for(int i = 0; i < corpo.length(); i++){
			palavra += "_";
			m.setCorpo(palavra);
		}
		return m;
	}
	public Palavra substituir(int pos, String letra){
		StringBuilder corp = new StringBuilder();		
		corp.append(this.getCorpo());
		corp.setCharAt(pos, letra.charAt(0));
		this.corpo = corp.toString();
		Palavra novaPalavra = new Palavra(this.getCorpo());
		
		
		return novaPalavra;
	}
	public Boolean estaCompleta(){
		if(this.getCorpo().contains("_")){
			return false;
		}
		return true;
	}
	/*
	 * Overriding toString() method to make it print correctly
	 * Override método toString() para imprimir corretamente
	 */
	@Override 
	public String toString(){
		String pal = "";
		for(int i = 0; i < corpo.length(); i++){
			pal += " " + corpo.charAt(i);
		}
		return pal;
				
		
	}
}
