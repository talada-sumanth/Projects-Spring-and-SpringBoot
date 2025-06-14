package in.spring.lifcycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	
	@PostConstruct
	public void init() {
		System.out.println("init method...");
	}
	
	public void getData() {
		System.out.println("getting data from db");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method....");
	}

}
