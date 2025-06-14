package in.spring.prac;

public class App {
	
	public static void main(String args[]) {
		
		IPayment p = new DebitCardPayment();
		PaymentService service = new PaymentService(p);
		service.doPayment(400.00);
		
	}
}
