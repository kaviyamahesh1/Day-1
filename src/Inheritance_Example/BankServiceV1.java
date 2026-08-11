package Inheritance_Example;

public class BankServiceV1 {
	void deposit(long accountNumber,float amount) {
		System.out.println(amount+" "+"rupees"+"deposited to"+accountNumber);
	}
	void withdraw(long accountNumber,float amount){
		System.out.println("Amount"+amount+"withdrawn from"+accountNumber);
	}
	void printReceipt() {
		System.out.println("Account Name:");
		System.out.println("Account Holder Name:");
		System.out.println("Balance");
	}
}
