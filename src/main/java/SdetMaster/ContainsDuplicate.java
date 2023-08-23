package SdetMaster;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


import com.sun.tools.javac.code.Attribute.Array;

import junit.framework.Assert;

public class ContainsDuplicate {

@Test

public void test1() {
	Assert.assertEquals(true, verifyDuplicate(new int [] {2,3,4,1}));
}

	
	
public boolean verifyDuplicate(int[] num) {
	
	
      
	for(int i =0; i<=num.length;i++) {
		for(int j = i+1; i<=num.length;j++) {
			//Set duplicate = new HashSet<>();
			//duplicate.contains(num);
			if(num[i] == num[j]) {
				System.out.println("Ture");
			return true;

			}
			System.out.println("Fasle");
			
		}
	}
	return false;
		
	
	
}

}