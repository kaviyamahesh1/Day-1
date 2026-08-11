package Salary;

public class EmployeeSalary {
	double basicSalary;
	double hra;
	double da;
	double totalSalary;
	EmployeeSalary(double salary){
		this.basicSalary=basicSalary;
	}
	void calculatedHRA(){
		hra=basicSalary*20/100;
	}
	void calculatedDA() {
		da=basicSalary*10/100;
	}
	void calculatedTotal() {
		totalSalary=basicSalary+hra+da;
	}
	void getSalary() {
		System.out.println("Basic Salary"+basicSalary);
		System.out.println("HRA"+hra);
		System.out.println("DA:"+da);
		System.out.println("Salary:"+totalSalary);
	}
}
