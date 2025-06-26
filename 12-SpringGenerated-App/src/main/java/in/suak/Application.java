package in.suak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.suak.entity.Employee;
import in.suak.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(Application.class, args);
		
		EmployeeRepository repo = ctx.getBean(EmployeeRepository.class);
		
		Employee emp = new Employee();
		
		emp.setEmpName("Sumanth");
		emp.setEmpRole("Software");
		emp.setSalary(12000.99);
		
		repo.save(emp);
	}

}
