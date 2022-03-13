package accessSpecifier.one;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person=new Person();
		
        //System.out.println(person.name); 	//private
		//private cannot be accessed outside of class and package
		
		System.out.println(person.company);		//public
		person.getName();		//public
		//public do not have any access restriction
		
		System.out.println(person.address);		//protected
		person.getAddress();		//protected
		//protected can only be accessed within its own package (as with package-private) and,
		//in addition, by a subclass of its class in another package.
		
		System.out.println(person.college);		//no-modifier
		person.getCollege(); 	//no-modifier
		//no modifier (package-private) can only be accessed within the package
	}

}
