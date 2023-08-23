package Week2.Day1;

import org.junit.Test;

public class UniqueElement {
	@Test
	public int[] isUnique(int [] num) {
		
		int[] n= {1,2,1};
		int[] empty = {};
		int unique = 0;
		//if(n == empty) {
			
		
		for(int i = 0;i<=n.length;i++) {
			for(int j=i+1;j<=n.length;j++) {
				if(n[i]!= n[j]) {
					// verify 1st element and secound element is not equal 1  ,  2
					unique = n[j];//2
					System.out.println("Unique Element "+ unique);
					if(n[i] == n[j]){
						int temp = n[i];
						System.out.println("Element Twice" +temp);
					}
				}
			}
		
		
		
		
		
		
		return n;
		}
	
	//}
	return empty;
}

}