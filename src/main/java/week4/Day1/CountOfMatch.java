package week4.Day1;

import org.junit.Test;

public class CountOfMatch {

	/*
	 * intput int team = 7;
	 * 
	 * output  6
	 * using if even condition is num%2 =0
	 * total match/2
	 * nested if num%2!=0
	 * 
	 * 
	 */
	@Test
	public void test1 () {
		findTeam(7);
	}
	@Test
	public void test2 () {
		findTeam(6);
	}
	public int findTeam(int num) {
		
	int matchesplayed=0;

	
	if (num%2==0){//6%2==0,
	matchesplayed=num/2;//6/2 = 3
	System.out.println(matchesplayed);
	num=matchesplayed/2;//3/2=1
	System.out.println(num);
	}
	if (num%2!=0){
	matchesplayed=(num-1)/2;
	System.out.println(matchesplayed);
	num=(num-1)/2+1;
	System.out.println(num);
	}
	
	
	return matchesplayed;
	}
	}
	

