package mk.springdemo.springbootthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mk.springdemo.springbootthymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findAllByOrderByLastNameAsc();
}
