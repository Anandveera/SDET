package week5.HomeWork;

public class EmployeeData {
	int age;
	int id;
	String name;
	
	public EmployeeData(int age,int id,String name) {
		this.id=id;
		this.age=age;
		this.name = name;
	}
	@Override
	public String toString() {
		return	"["+"id="+id+",age="+age+",name="+name+"]";
	}
	
	

}
