package Inheritance_Example;

public class NetBanking extends PaymentService{
	void payWithNetBanking(int customerId,long mobileNo) {
		super.sendOtp(mobileNo);
		System.out.println("Net Banking with"+customerId+ "Successful");
	}
}
