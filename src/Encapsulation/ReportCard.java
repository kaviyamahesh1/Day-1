package Encapsulation;

public class ReportCard {
	private int rollNumber;
	private String stuName;
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int m5;
	private float avg;
	private int total;
	private String grade;
    static String school="Srec";
	
	public ReportCard(int rollNumber, String stuName, int m1, int m2, int m3, int m4, int m5) {
		this.rollNumber = rollNumber;
		this.stuName = stuName;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}
	

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	public float getAvg() {
		return avg;
	}
	public int getTotal() {
		return total;
	}
	public String getGrade() {
		return grade;
	}
	void getReportCardDetails() {
		System.out.println("Welcome");
		System.out.println("RollNumber:" +this.rollNumber+" "+
				"Name:" +this.stuName+" "+
				"Tamil:"+this.m1+" "+
				"English:"+this.m2+" "+
				"Maths:"+this.m3+" "+
				"Science:"+this.m4+" "+
				"Social:"+this.m5);
		System.out.println("Total: " + this.total);
        System.out.println("Average: " + this.avg);
        System.out.println("Grade: " + this.grade);
		System.out.println("School:"+this.school);
	}
	void calculateTotal() {
		total=m1+m2+m3+m4+m5;
		avg=total/5;
		if(avg>=90) {
			grade="A";
		}else if(avg>=70){
			grade="B";
		}else if(avg>=50) {
			grade="C";
		}else {
			grade="D";
		}
	}
}
