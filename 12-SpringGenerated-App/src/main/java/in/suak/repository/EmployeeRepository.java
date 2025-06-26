package in.suak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.suak.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
