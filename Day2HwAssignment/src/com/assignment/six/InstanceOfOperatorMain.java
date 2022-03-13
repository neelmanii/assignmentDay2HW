package com.assignment.six;

public class InstanceOfOperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle car=new Car();
		
		Vehicle honda=new Honda();
		
		Car honda2=new Honda();
		
		boolean flag=car instanceof Vehicle;
		System.out.println("car is instanceof Vehicle - "+flag);
		
		flag=honda instanceof Vehicle;
		System.out.println("honda is instanceof Vehicle - "+flag);
		
		flag=honda instanceof Car;
		System.out.println("honda is instanceof Vehicle - "+flag);
		
		flag=honda2 instanceof Honda;
		System.out.println("honda2 is instanceof Honda - "+flag);
		
		flag=honda2 instanceof Car;
		System.out.println("honda2 is instanceof Car - "+flag);
		
		flag=honda instanceof Flight;
		System.out.println("honda is instanceof Flight - "+flag);
		
	}
}

class Vehicle{
	
}
class Car extends Vehicle{
	
}
class Honda extends Car{
	
}
class Flight extends Vehicle{
	

	}


