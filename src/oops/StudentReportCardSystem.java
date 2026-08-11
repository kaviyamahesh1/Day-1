package oops;

import Encapsulation.ReportCard;

class StudentReportCard{
	int rollNumber;
	String stuName;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	float avg;
	int total;
	String grade;
	StudentReportCard(int rollNumber,String stuName,int m1,int m2,int m3,int m4,int m5) {
		this.rollNumber=rollNumber;
		this.stuName=stuName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		
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
		System.out.println();
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

public class StudentReportCardSystem {

	public static void main(String[] args) {
		StudentReportCard s1=new StudentReportCard(101,"Aditi",50,50,50,50,50);
		StudentReportCard s2=new StudentReportCard(102,"Banu",12,34,56,78,90);
		StudentReportCard s3=new StudentReportCard(103,"Candle",90,90,98,98,98);
		StudentReportCard s4=new StudentReportCard(104,"Dennis",14,76,75,45,65);
		s1.calculateTotal();
		s2.calculateTotal();
		s3.calculateTotal();
		s4.calculateTotal();
		s1.getReportCardDetails();
		s2.getReportCardDetails();
		s3.getReportCardDetails();
		s4.getReportCardDetails();
	}
	
}
