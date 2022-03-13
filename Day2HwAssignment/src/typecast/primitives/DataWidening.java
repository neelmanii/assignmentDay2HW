package typecast.primitives;

public class DataWidening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * data-widening
		 * converting variables with smaller datatype to larger datatype
		 */
		
		byte b=90;
		short s=98;
		
		int i=b;
		System.out.println(i);	//90
		i=s;
		System.out.println(i); //98
		
		long l=i;
		System.out.println(l);	//98
	}

}
