package com.gabriel.estudos.xti.desafioraizquadrada;

public class Matematica {
	
	public int raiz(int num){
		int raiz = 0;
		for(int i = 0; i <= num ; i++){
			if(i % 2 != 0){
				num -= i;
				raiz++;
			}
		}
		return raiz;
		
	}

}
