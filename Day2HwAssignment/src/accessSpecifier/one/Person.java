package accessSpecifier.one;

public class Person {

	private String name="Neelmani";
	public String company="Publicis Sapient";
	String college="Haldi Institute og Technology";	//no modifier
	protected String address="Bengaluru";
	
	public void getName() {
		System.out.println("Neelmani - method");
	}
	private void getCompany() {
		System.out.println("Publicis Sapient - method");
	}
	void getCollege() {		//no modifier
		System.out.println("Haldi Institute og Technology - method");
	}
	protected void getAddress() {
		System.out.println("Bengaluru - method");
	}
	
	public static void main(String[] args) {
		Person person=new Person();
		System.out.println(person.name);	//private
		person.getCompany();	//private
		//private can only be accessed within the class.
		
	}
	

}
