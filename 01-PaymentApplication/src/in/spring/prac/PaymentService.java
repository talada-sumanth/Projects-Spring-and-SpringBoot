package in.spring.prac;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService() {
		
	}
	
	public PaymentService(IPayment payment) {
		this.payment = payment; 
	}
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public void doPayment(double billAmt) {
		boolean status =  payment.proccessPayment(billAmt);
		if(status) {
			System.out.println("Printing Recipt");
		}else {
			System.out.println("Payment Declined");
		}
	}
}
