package oops;
class Emp{
	String empId;
	String empName;
	int empAge;
	Emp(){
		System.out.println("Welcome");
	}
	Emp(String empId,String empName,int empAge){
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
	}
	void getDetails() {
		System.out.println(this.empId+" "+ this.empName+" "+ this.empAge);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		Emp e1=new Emp("E123","Kaviya",20);
		e1.getDetails();
		Emp e2=new Emp();
		e2.getDetails();
		
//		System.out.println("EmpId:"+e1.empId+
//				"EmpName:"+e1.empName+
//				"EmpAge:"+e1.empAge);
	}
}
