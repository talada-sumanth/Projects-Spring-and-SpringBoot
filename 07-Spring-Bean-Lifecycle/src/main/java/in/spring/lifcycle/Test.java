package in.spring.lifcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserDAO dao = ctx.getBean(UserDAO.class);
		dao.getData();
		((ConfigurableApplicationContext) ctx).close();
	}
}
