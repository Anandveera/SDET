package week5.HomeWork;

public class ShorestDistanceOfChar {
	
	/*
	 * input is interger String
	 * output is finding the min length of index  for given short target
	 * iterate till target e
	 * dicrement once meet the target and get the index
	 * increment till e	and find index of each char
	 * 
	 */
	
	public String isShortChar(String str,char c) {
		
		int length = str.length();
		int right=0;
		int left=0;
		
		while(left<=length) {
			str.charAt(left);
			str.charAt(right);
			if(left==c) {
				left--;
				
			}else {
				right++;
			}
			
		}
		return str;
		
	}

}
