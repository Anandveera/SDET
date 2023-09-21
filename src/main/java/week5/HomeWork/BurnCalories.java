package week5.HomeWork;

import org.testng.annotations.Test;

public class BurnCalories {
	
	@Test
	public void test1() {
		dietPlan(new int[] {1,2,3,4,5},1,3,3);
	}
	public int dietPlan(int[] calories, int k, int lower, int upper) {
		
        int temp = 0;
        
        
     for(int i=0;i<k;i++) {
    	  temp=temp+calories[i];
    	 if(temp<lower) {
    		 temp++;	 
    	 }else if(temp>upper) {
    		 temp--;
    	 }
    	 for (int j = k; j < calories.length; j++) {
    		 temp=temp+calories[j];
    		 if(temp<upper) {
    			 System.out.println(temp);
    		 }
    	 }
     }
	return temp;

	}
}
