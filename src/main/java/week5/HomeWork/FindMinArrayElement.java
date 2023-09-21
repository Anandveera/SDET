package week5.HomeWork;

import org.testng.annotations.Test;

public class FindMinArrayElement {
	@Test
	public void test() {
		min(new int[]{2,8,9,1});
		
	}
	
	public void min(int a[]) {
		int m=a[0];
		for(int i=0;i<=a.length;i++) {
			if(m>a[i]) {
				m=a[i];
				System.out.println(a[i]);
			}
			
		}
	}

}
