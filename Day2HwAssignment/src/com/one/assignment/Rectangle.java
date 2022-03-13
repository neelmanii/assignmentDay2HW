package com.one.assignment;

public class Rectangle extends FigureAssignment2 {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		super(length,breadth);
	}

	public double area() {
		return getBreadth()*getLength();
	}

	public int getLength() {
		return super.dim1;
	}

	public int getBreadth() {
		return super.dim2;
	}

}
