package in.spring.practice;

public class PetrolEngine implements IEngine{

	
	public int start(boolean status) {
		System.out.println("Petrol Engine Started");
		return 1;
	}
}
