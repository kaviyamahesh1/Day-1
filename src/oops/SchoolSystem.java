package oops;
class Student{
	int studentId;
	String StudentName;
	int age;
	char gender;
	void setValues(int studentId,String StudentName,int age,char gender) {
		this.studentId=studentId;
		this.StudentName=StudentName;
		this.age=age;
		this.gender=gender;
	}
}

public class SchoolSystem {

	public static void main(String[] args) {
		Student s1=new Student();
//		s1.studentId=101;
//		s1.StudentName="Kavs";
//		s1.age=18;
//		s1.gender='F';
		s1.setValues(101 , "Kaviya" , 18 , 'F');
		System.out.println(s1.studentId +" "+s1.StudentName+" "+s1.age+" "+s1.gender);
		
	}

}
