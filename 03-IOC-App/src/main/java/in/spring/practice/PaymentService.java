package in.spring.practice;

public class PaymentService {
	
	public PaymentService() {
		System.out.println("Payment service :: Constructor");
	}
	
	public  PaymentService(IPayment payment) {
		this.payment = payment;
	}

	private IPayment payment;
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		
		if(status) {
			System.out.println("Recipt Printing.....");
		}else { 
			System.out.println("Card Declined.......");
		}
	}
}
