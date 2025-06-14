package in.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("UserBean.xml");
		UserService us = ctx.getBean(UserService.class);
		us.printName(1);

	}

}
