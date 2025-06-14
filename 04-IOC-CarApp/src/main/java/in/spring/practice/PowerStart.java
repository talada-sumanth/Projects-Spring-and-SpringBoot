package in.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PowerStart {

	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("CarBean.xml");
		
		Car ps = cxt.getBean(Car.class);
		
		ps.drive(true);

	}

}
