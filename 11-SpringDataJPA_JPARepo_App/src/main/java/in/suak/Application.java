package in.suak;

import in.suak.entity.Employee;
import in.suak.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private final EmployeeRepository employeeRepository;

    Application(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(Application.class, args);
		
		EmployeeRepository repo = ctx.getBean(EmployeeRepository.class);
		
		Employee emp = new Employee(101, "Sumanth", 1200.99, "Male", "Associate Software");
		Employee emp1 = new Employee(102, "Sai Harish", 1200.99, "Male", "Associate Software");
		Employee emp2 = new Employee(103, "Praveen", 1200.99, "Male", "Senior Software");
		Employee emp3 = new Employee(104, "Vamsi", 1200.99, "Male", "Graduate Software");
		Employee emp4 = new Employee(105, "Chandu", 1200.99, "Male", "Tech Lead");
		
		repo.saveAll(Arrays.asList(emp1, emp2, emp3, emp4));
		
		System.out.println("Records saved......");
		
		repo.getEmployees().forEach(System.out::println);
		
		if(repo.existsById(106)) {
		System.out.println("to insert record already existed");
		}else {
			repo.insertData();
			System.out.println("Record Inserted......");
				
		}
		
		if(repo.existsById(107)) {
			System.out.println("to insert record already existed");
			}else {
				repo.insertData2();
				System.out.println("Record Inserted......");
			}
		if(repo.existsById(108)) {
			System.out.println("to insert record already existed");
			}else {
				repo.insertData3();
				System.out.println("Record Inserted......");
			}
		
		if(repo.existsById(109)) {
			System.out.println("to insert record already existed");
			}else {
				repo.insertData4();
				System.out.println("Record Inserted......109");
			}
		
		if (repo.existsByEmpSalary(20000.78)) {
			repo.updateData();
		    System.out.println("Salary updated");
		} else {
		    repo.updateData(); // your native query method
		    System.out.println(" no Update performed.");
		}
		
		if (repo.countByEmpSalaryLessThan(5000.0) > 0) {
		    repo.deleteLowSalaries();
		    System.out.println("Low salary records deleted.");
		} else {
		    System.out.println("No low salary records to delete.");
		}
	}
}
