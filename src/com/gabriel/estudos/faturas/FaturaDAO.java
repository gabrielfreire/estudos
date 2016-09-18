package com.gabriel.estudos.faturas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaturaDAO {

	public List<Fatura> buscarFaturasVencidas(){
		List<Fatura> faturasVencidas = new ArrayList<>();
		Fatura f1 = new Fatura("gab@gmail.com", 50.0, LocalDate.now().minusDays(3));
		Fatura f2 = new Fatura("jao@gmail.com", 250.0, LocalDate.now().minusDays(5));
		Fatura f3 = new Fatura("maria@gmail.com", 400.0, LocalDate.now().minusDays(4));
		
		faturasVencidas.add(f1);
		faturasVencidas.add(f2);
		faturasVencidas.add(f3);
		
		return faturasVencidas;
		
	}
	
}
