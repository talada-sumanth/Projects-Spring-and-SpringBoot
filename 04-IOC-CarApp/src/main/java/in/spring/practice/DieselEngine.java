package in.spring.practice;

public class DieselEngine implements IEngine {
	
	public int start(boolean status) {
		System.out.println("Diesel Engine Started");
		return 1;
	}

}
