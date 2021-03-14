package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empid;
	private String name;
	private String email;
	private int phone;
	private String created_by;
	private Date created_on;
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", created_by="
				+ created_by + ", created_on=" + created_on + "]";
	}
	
	public static Employee create(int empid,
	 String name,
	 String email,
	 int phone,
	 String created_by,
	 Date created_on) {
		Employee employee= new Employee();
		employee.setEmpid(empid);
		employee.setName(name);
		employee.setEmail(email);
		employee.setPhone(phone);
		employee.setCreated_on(created_on);
		employee.setCreated_by(created_by);
		return employee;
	}
	
	
	
}
