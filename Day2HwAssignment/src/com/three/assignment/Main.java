package com.three.assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal dog=new Dog();
		dog.eat();
		dog.sleep();
		dog.givesBirth();
		dog.move();
		dog.produceMilk();
		dog.warmBlooded();
		
		
		System.out.println("===============");
		
		Reptile croc=new Crocodile();
		croc.eat();
		croc.coldBlooded();
		croc.crawl();
		croc.layEggs();
		croc.move();
		croc.sleep();
	}

}
