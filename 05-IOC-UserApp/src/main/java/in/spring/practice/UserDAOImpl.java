package in.spring.practice;

import java.util.Scanner;

public class UserDAOImpl implements UserDAO {

	
	public String findName(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Name :: ");
		String uName = sc.next();
		System.out.println("User Name ::"+uName);
		return uName;
	}
}
