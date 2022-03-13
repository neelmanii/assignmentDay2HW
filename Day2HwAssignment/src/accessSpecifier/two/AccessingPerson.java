package accessSpecifier.two;
import accessSpecifier.one.Person;

public class AccessingPerson {
	public static void main(String[] args) {
		Person person=new Person();
		
		System.out.println(person.company);	//public
		person.getName();	//public
		
		
		//public has no restriction
		//private methods and variables cannot be accessed outside of package and outside of class
		//no modifier methods and variables cannot be accessed outside of package
		
		
	}

}

