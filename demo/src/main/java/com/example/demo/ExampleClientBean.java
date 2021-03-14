package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ExampleClientBean {
	
	@Autowired
	EmployeeService employeeService;
	
	public void run() {
		Employee employee=Employee.create(11,"Rajesh","rajesh123@gmail.com",8796543234,"Srilekha",14-03-2021);
		employeeService.saveEmployee(employee);
		
		employee=Employee.create(12,"Mahesh","mahesh123@gmail.com",9766543237,"Srilekha","14-03-2021");
		employeeService.saveEmployee(employee);
		
		List<Employee> allEmployees= employeeService.getAllEmployees();
		System.out.println("Employees loaded :" + allEmployees);
		
		employee = employeeService.getEmployeeById(2);
		System.out.println("employee loaded by id:" + employee);
		
		System.out.println("updating employee email with id emp2");
		employee.setEmail("ravi@gmail.com");
		employeeService.updateEmployee(employee);
		
		System.out.println("deleting employee by id emp1");
		employeeService.deleteEmployee(1);
		
		allEmployees = employeeService.getAllEmployees();
        System.out.println("Employees loaded: " + allEmployees);
		
		
		
		
	}

}
