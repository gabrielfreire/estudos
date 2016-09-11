package com.gabriel.estudos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.*;

class Bas{
	int c;
	void c (int c){
		this.c = c; //Same name of local variables and Class variables require this.
	}
}
public class Teste{
	
	static int i = 3;
	
	public static void main(String... args){
		//Instantiating a inner class
		Foo f = new Foo();
		Foo.Bar bar = f.new Bar();
		//Array casts
		int[][] a = {{1,2},{3,4}};
		Object o1 = a;
		int[][] a2 = (int[][]) o1;
		int[] b = (int[]) a[1];
		//     i = 10                   i = 3                i = 3
		for(new Teste().i = 10; new Teste().i < 100; new Teste().i++){
			System.out.print(i + " ");
		}	
		System.out.println(b[1]);
		//Pattern Class(Regex)
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher("ab34ef");
		while(m.find()){
			System.out.print(m.start() + ": " + m.group() + " ");
		}
		
		
	
	
	}
}
/*
 * Inner class study
 */
class Foo{
	class Bar{
		
	}
}
