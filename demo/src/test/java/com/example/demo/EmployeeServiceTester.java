package com.example.demo;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTester {
	
	@InjectMocks
	EmployeeService employeeservice = new EmployeeService();
	
	@Mock
	Dao dao;
	
	@Test
	public void testDelete() {
		when(dao.delete(1)).thenReturn("deleted");
		
		Assert.assertEquals(employeeservice.deleteEmployee(1),"deleted");
	}
	
	
	
	

}
