package Inheritance_Example;

public class CreditCardService extends PaymentService{
	void payWithCreditCard(long cardNo,long mobileNo) {
		super.sendOtp(mobileNo);
		System.out.println("Purchased with Creditcard:"+cardNo);
	}
}