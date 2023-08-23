package Week3.Day1;

import org.junit.Test;

public class JewelStone {
	
	private static final String String = null;

	/*
	 * Find the stone count which is in jewel
	 * 
	 * input String Jewel = "Aab";
	 * String Stone = 'aaADD";
	 * 
	 * int output =0;
	 * 
	 * need to check jewel Aab is present in the stone
	 * 
	 * Convert the string into char ---> Jewel.tocharAt() ----> Strone.toCharAt()
	 * iterate the length of the jewel 
	 * 
	 * if(Jewel == Stone){
	 * output = Stone;
	 * Integer.PhareseInt(output);
	 * 
	 * 
	 * 
	 */
@Test
	public void test1() {
		
	
	FindStoneInJewel("Aab","aaADD");
	System.out.println("============");
	}
@Test
public void test2() {
	

FindStoneInJewel("A","aaADD");
System.out.println("============");
}
@Test
public void test3() {
	

FindStoneInJewel("A","DD");
System.out.println("Stone not matched");
}
	
	public String FindStoneInJewel(String Jewel,String Stone) {
		
		char output = 0;
		for(int i=0;i<Jewel.length();i++) {
			char jewelcount = Jewel.charAt(i);
		//	System.out.println(jewelcount);
			for(int j = 0;j<Stone.length();j++) {
				char stoneCount = Stone.charAt(j);
				
				
			//	System.out.println(stoneCount);
				
				if(jewelcount==stoneCount) {
					output=stoneCount;
					System.out.println(output);	
					
					//System.out.println(output);
					//Integer.parseInt(output);
					
				}else {
								}
			}
		}
		
		
		return String;
	}

	
}

