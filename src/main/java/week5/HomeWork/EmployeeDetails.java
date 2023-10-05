package week5.HomeWork;

import java.util.HashMap;

public class EmployeeDetails {
	public static void main(String arg[]) {
		HashMap<String,EmployeeData>hM=new  HashMap<String, EmployeeData>();
		hM.put("Anand", new EmployeeData(1,30,"Anand"));
		hM.put("Aathira", new EmployeeData(2,3,"Aathira"));
	}


	

}
