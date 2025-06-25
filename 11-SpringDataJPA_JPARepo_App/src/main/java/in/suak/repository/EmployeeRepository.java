package in.suak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import in.suak.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "select * from emp_tbl", nativeQuery = true)
	List<Employee> getEmployees();

	@Modifying
	@Transactional
	@Query(value = "insert into emp_tbl (depart, emp_gender, emp_name, emp_salary, emp_id) " +
			"values ('Manager','Male','MadhuKumar',12400.99,106)", nativeQuery = true)
	void insertData();

	@Modifying
	@Transactional
	@Query(value = "insert into emp_tbl (depart, emp_gender, emp_name, emp_salary, emp_id) " +
			"values ('Sales','Fe-Male','Rohit',10000.99,107)", nativeQuery = true)
	void insertData2();

	@Modifying
	@Transactional
	@Query(value = "update emp_tbl set emp_salary = 20000.78 where emp_id in (101,102,103,104,105,106)", nativeQuery = true)
	void updateData();

	boolean existsByEmpSalary(Double empSalary);
	
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 */
	@Query(value = "delete from emp_tbl where emp_salary < 5000", nativeQuery = true)
	void deleteLowSalaries();

	long countByEmpSalaryLessThan(Double amount);

	
}
