package com.gabriel.estudos.webinar03.exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorNumericoRandomico implements GeradorNumerico{
	

	@Override
	public int proximo() {
		
		int numRandom = (int) (Math.random() * 301);
		return numRandom;
	}

}
