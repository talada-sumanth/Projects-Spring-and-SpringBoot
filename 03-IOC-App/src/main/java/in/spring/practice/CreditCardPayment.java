package in.spring.practice;

public class CreditCardPayment implements IPayment{

	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}
	
	public boolean processPayment(double billAmt) {
		System.out.println("Credit Card Payment Successfull..");
		return true;
	}
	
}
