package mk.springdemo.springbootthymeleaf.service;

import java.util.List;

import mk.springdemo.springbootthymeleaf.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
}
