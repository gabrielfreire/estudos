package com.gabriel.estudos.faturas;

import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		FaturaDAO faturaDao = new FaturaDAO();
		List<Fatura> faturasVencidas = faturaDao.buscarFaturasVencidas();
		
		EmailSender enviador = new EmailSender();
		/*
		 * it would be normally done like down below
		 */
//		for(Fatura f : faturasVencidas){
//			enviador.enviar(f.getEmailDevedor(), f.resumo());
//		}
		//END USUAL SOLUTION
		
		
		//Doing using JAVA 8 new features
		faturasVencidas.forEach(f -> {
			enviador.enviar(f.getEmailDevedor(), f.resumo());
		});
		//END OPTION 1
		System.out.println("******************************");
		//or
		faturasVencidas.forEach(f -> enviador.enviar(f.getEmailDevedor(), f.resumo()));
		//END OPTION 2
	}

}
