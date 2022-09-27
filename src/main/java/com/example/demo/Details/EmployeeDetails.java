package com.example.demo.Details;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeDetails {

	public List<Employee> getEmpDetails();
	
	public Employee getEmployee(long id);
	
	public Employee addEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(long parseLong);
}
