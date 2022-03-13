package com.one.assignment;

public class Main {

	public static void main(String[] args) {
		Triangle triangle=new Triangle(10,16);
		Rectangle rectangle=new Rectangle(7,23);
		
		System.out.println("Area of triangle= "+triangle.area());
		System.out.println("Area of rectangle= "+rectangle.area());
	}

}
