package typecast.primitives;

public class DataNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Data-Narrowing
		 * converting variables with larger datatype to smaller datatype
		 * This leads to data loss
		 * We should cast the smaller datatype at the time of casting to the RHS
		 */
		
		long lng= 9_999_888_823L;
		
		//data-narrowing
		int i=(int) lng;
		System.out.println(i);	// o/p= 1409954231	//data loss occurred
		
	}

}
