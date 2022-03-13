package com.one.assignment;

public class Triangle extends FigureAssignment2{
	private int base;
	private int height;
	
	public Triangle(int base,int height) {
		super(base,height);
	}

	public double area() {
		return (getBase()*getHeight())/2;
	}

	public int getBase() {
		return super.dim1;
	}

	public int getHeight() {
		return super.dim2;
	}
}
