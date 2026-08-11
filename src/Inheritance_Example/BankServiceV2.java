package Inheritance_Example;

public class BankServiceV2 extends BankServiceV1{
	void updateAccountDetails() {
		System.out.println("Account details Updated...");
	}
	void updateAadharNumber() {
		System.out.println("Aadhar number Updated...");
	}
	void applyForPersonalLoan(long accountNumber,float loanAmount,int tenure ) {
		System.out.println("Your loan amount is processing...");
	}
}
