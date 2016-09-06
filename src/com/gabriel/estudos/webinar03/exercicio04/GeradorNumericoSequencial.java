package com.gabriel.estudos.webinar03.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class GeradorNumericoSequencial implements GeradorNumerico{

	private int num = 1;
	
	@Override
	public int proximo() {
		return this.num++;
	}

}
