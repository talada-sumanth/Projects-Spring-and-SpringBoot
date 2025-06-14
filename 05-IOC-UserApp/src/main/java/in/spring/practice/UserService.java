package in.spring.practice;

public class UserService {

	private UserDAO dao;
	
	public UserService() {
		
	}
	
	public void setUserDAO(UserDAO dao) {
		this.dao=dao;
	}
	
	public void printName(int id) {
		String name = dao.findName(id); 
		if (name != null) {
			System.out.println("User Name is :: " + name);
		}
	}
}
