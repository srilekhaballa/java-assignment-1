package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
	@Autowired
	private Dao<Employee> dao;
	
    public void saveEmployee(Employee employee) {
        try {
            dao.save(employee);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
    public List<Employee> getAllEmployees() {
        try {
            return dao.loadAll();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Employee getEmployeeById(int empid) {
        try {
            return dao.load(empid);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void deleteEmployee(int empid) {
        try {
            dao.delete(empid);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
    public void updateEmployee(Employee employee) {
        try {
            dao.update(employee);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


