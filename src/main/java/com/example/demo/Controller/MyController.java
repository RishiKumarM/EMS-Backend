package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Details.EmployeeDetails;
import com.example.demo.entities.Employee;

@RestController
@CrossOrigin
public class MyController {
	
	@Autowired
	private EmployeeDetails employeeDetails;
	
	//get the employees details
	
	@GetMapping("/getEmpAll")
	public List<Employee> getEmpDetails()
	{
		return this.employeeDetails.getEmpDetails();
	}
	//Single Employee details
	  
	@GetMapping("/getEmpAll/{id}")
	public Employee getEmployee(@PathVariable String id) 
	{
		System.out.println("EmployeeId :" +id);
		return this.employeeDetails.getEmployee(Long.parseLong(id));
	}
	
	//Insert New Employee Details 
	@PostMapping("/postEmp")
	public Employee addEmlpoyee(@RequestBody Employee employee)
	{
		System.out.println(employee);
		return this.employeeDetails.addEmployee(employee);
	}
	
	//update the employee details
	@PutMapping("/updateEmp")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.employeeDetails.updateEmployee(employee);
	}
	
	//Delete Employee Details
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String id)
	{
		try { 
			this.employeeDetails.deleteEmployee(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
 