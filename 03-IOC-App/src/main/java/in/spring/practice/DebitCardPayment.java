package in.spring.practice;

public class DebitCardPayment implements IPayment{
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}
	
	public boolean processPayment(double billAmt) {
		System.out.println("Debit Card Payment Successfull..");
		return true;
	}

}
