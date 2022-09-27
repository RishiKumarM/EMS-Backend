package com.example.demo.Details;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.entities.Employee;

@Service
public class EmployeeDetailsImp implements EmployeeDetails {
	
	@Autowired
	public EmployeeDao employeeDao;
	 
	//  List<Employee> list;
	public EmployeeDetailsImp()
	{
 
	}

	@Override
	public List<Employee> getEmpDetails() {
		
		
		return employeeDao.findAll() ;
	}

	@Override
	public Employee getEmployee(long id) 
	{
		System.out.println("id :"+id);
		
		return employeeDao.findById(id).get();
	}

	@Override
	public Employee addEmployee(Employee employee) {  
		
		//list.add(employee);
		 employeeDao.save(employee);
		return employee ;
	}
	
	@Override
	public Employee updateEmployee(Employee employee)
	{
		
		employeeDao.save(employee); 
		return employee;
	} 
	  
	
	@Override
	public void deleteEmployee(long parseLong)
	{
		//list=this.li    st.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Employee entity = employeeDao.getReferenceById(parseLong);
		 employeeDao.delete(entity); 
	}
  
}
