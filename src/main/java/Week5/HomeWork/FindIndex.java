package Week5.HomeWork;

import java.util.Arrays;

public class FindIndex {
	
	public static void main(String[] args) {
		double d=10.0/-0;
		System.out.println(d);
		System.out.println();
		int[] primaryArray= {1,2,4,5};
		//int[] secoundarArray=primaryArray;
		//secoundarArray[2]=3;
	//	System.out.println(Arrays.copyOf(primaryArray,secoundarArray[2]));
		//Arrays.copyOfRange(secoundarArray, 0, 0);
		
		int[] secoundarArray=Arrays.copyOf(primaryArray, primaryArray.length);
		int[] temp =Arrays.copyOfRange(secoundarArray, 0, 3);
		secoundarArray[2]=3;
		System.out.println(Arrays.toString(secoundarArray));
		
		
	}
	

}
