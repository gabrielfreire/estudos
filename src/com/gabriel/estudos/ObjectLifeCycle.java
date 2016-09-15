package com.gabriel.estudos;

public class ObjectLifeCycle {

	public static void main(String[] args) {
		//No objects were created
		Carro c;
		//One object c of type Carro was created. c is an instance of Class Carro{}
		c = new Carro();
		c.setNome("Fox");
		//Another Carro c was created with the same instance variable name
		c = new Carro(); // from this line forward the first Carro is elegible for garbage collection
		c.setNome("Ferrari");
		//Now Carro c is not accessible and is eligible to be garbage collected
		c = null;//now the first and second objects are elegible for garbage collection
		System.out.println(c.getNome());
		
		Carro c1; //no object was created
		for(int i = 0; i < 10; i++){
			c1 = new Carro(); //10 Carro objects are created locally inside a for loop
			c1.setNome("carro " + i);
		}
		//System.out.println(c1.getNome()); //c1 can't be accessed outside the for loop. The 10 Carro objects created are elegible for garbage collection
			
		
		
	}

}
