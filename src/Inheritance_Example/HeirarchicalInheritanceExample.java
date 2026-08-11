package Inheritance_Example;
import java.util.*;
public class HeirarchicalInheritanceExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. CreditCard");
		System.out.println("2. Netbanking");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter CreditCard Number:");
			int cardNo=sc.nextInt();
			System.out.println("Enter Mobile Number:");
			long mobileNo=sc.nextLong();
			CreditCardService obj1=new CreditCardService();
			obj1.payWithCreditCard(cardNo,mobileNo);
			break;
		case 2:
			System.out.println("Enter your Customer ID:");
			int customerID=sc.nextInt();
			System.out.println("Enter your mobile Number:");
			long mobileNo1=sc.nextLong();
			NetBanking obj2=new NetBanking();
			obj2.payWithNetBanking(123, 9959448880l);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		sc.close();
	}
}
