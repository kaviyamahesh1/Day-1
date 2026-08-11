package Encapsulation;

public class ReportCardSystem {

	public static void main(String[] args) {
		ReportCard s1=new ReportCard(101,"Aditi",50,50,50,50,50);
		ReportCard s2=new ReportCard(102,"Banu",12,34,56,78,90);
	    ReportCard s3=new ReportCard(103,"Candle",90,90,98,98,98);
		ReportCard s4=new ReportCard(104,"Dennis",14,76,75,45,65);
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
