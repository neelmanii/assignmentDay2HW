package typecast.nonprimitives;

public class UpCastingDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Up-casting is a process of referring sub class object to super class type.
		 * The drawback of up-casting is, we cannot invoke or access sub class specific methods and instance variables,
		 * only super class common methods, variables and overridden methods can be invoked or accessed.
		 */
		Employee e1=new Employee();
		Employee e2=new Employee();
		Student s1=new Student();
		Student s2=new Student();
		
		Object[] arr= {e1,e2,s1,s2};	//Up-casting
		System.out.println(arr[1].toString()); 		//overridden method
		System.out.println(arr[2].toString());		//super class common method
		
		//sub class specific method, and it cannot be invoked because of  up-casting
//		System.out.println(arr[0].emp());
		
		System.out.println("========Down-casting========");
		/*
		 * Down-casting is a process of converting larger class-type to smaller class-type.
		 * It's a process of assigning parent data-type to a specific child data-type.
		 * We need to cast the smaller data-type at the time of assigning.
		 * If Down-casting is performed without up-casting, it will throw a ClassCastException,
		 * so it's mandatory to up-cast before performing down-casting
		 */
		
		Employee emp= (Employee) arr[0];
		System.out.println(emp.emp());
		Student stdnt= (Student) arr[3];
		System.out.println(stdnt.stdnt());
		
		
	}
}

class Employee {

	String emp() {
		return "Employee specific method";
	}
	@Override
	public String toString() {
		return "Overridden toString() method in Employee class";
	}
}

class Student {
	String  stdnt() {
		return "Java Development student";
	}
	}


