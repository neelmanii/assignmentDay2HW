package org.demo.client;
import org.demo.client.Calculator;


public class MathTester {
	public static void main(String[] args) {
		Calculator calc=new Calculator(29, 17);
		System.out.println(calc.getValue1()+" + "+calc.getValue2()+" = "+ calc.add());
		System.out.println(calc.getValue1()+" - "+calc.getValue2()+" = "+ calc.subtract());
		System.out.println(calc.getValue1()+" x "+calc.getValue2()+" = "+ calc.multiply());
		
	}

}
