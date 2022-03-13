package accessSpecifier.two;
import accessSpecifier.one.Person;
public class AccessingPerson2 extends Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessingPerson2 p=new AccessingPerson2();
		
		System.out.println(p.address);	//protected
		
		p.getAddress();	//protected
		
		//protected can be accessed outside of package only by its subclass.
	}

}
