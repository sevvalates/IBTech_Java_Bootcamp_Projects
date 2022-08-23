package com.godoro.interfaces;

public class Test {

	public static void main(String[] args) {
		
		Piegon piegon=new Piegon("Pacali");
		piegon.fly();
		piegon.land();
		
		Bird bird=new Piegon("Taklaci");
		bird.fly();
		bird.land();
		
		Flyable flyable = new Piegon("Postaci");
		flyable.fly();
		flyable.land();
		
		Bat bat=new Bat("Batman");
		bat.fly();
		bat.land();
		
		Mammal mammal=new Bat("Robin");
		//mammal.fly();
		//mammal.land();
		
		Flyable flyable2 = new Bat("Vampir");
		flyable2.fly();
		flyable2.land();
		
		
		makeFly(piegon);
		makeFly(bird);
		makeFly(flyable);
		makeFly(bat);
		//makeFly(mammal);
		makeFly(flyable2);

	}
	
	private static void makeFly(Flyable flyable) {
		
		System.out.println();
		System.out.println("UC!");
		flyable.fly();
		System.out.println("KON!");
		flyable.land();
		
	}
	
}
