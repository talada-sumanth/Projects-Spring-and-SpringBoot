package in.spring.practice;

public class Car {
	
	private IEngine eng;
	
	public Car() {
		
	}
	
	public Car(IEngine eng) {
		this.eng = eng; 
	}
	
	public void setCar(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive(boolean status) {
		 int sts = eng.start(status);
		 
		 if(status) {
			 System.out.println("Journey Started...");
		 }else {
			 System.out.println("vechile problem...");
		 }
	}

}
