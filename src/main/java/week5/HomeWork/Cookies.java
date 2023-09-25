package week5.HomeWork;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Cookies {
	
	/*
	 * input is inter arr 
	 * output is inter arr
	 * sort the two given arr
	 * find the length and compare and increment
	 */
	@Test
	public void test() {
		findCookie(new int[]{1,2,3},new int[] {2});
	}
	
	
	public int findCookie(int[] g,int[] s) {
		
		  Arrays.sort(g);
		    Arrays.sort(s);
		    int i = 0;
		    int j = 0;
		    int girl = g.length;
		    int boy = s.length;
		    while (i < girl && j < boy) {
		        if (g[i] <= s[j]) {
		            i++;
		            System.out.println(g[i]);
		        }
		        j++;
		        System.out.println(j);
		    }
		    return i;
		
	}

}
