package com.example.demo.entities;

import javax.persistence.Entity;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
//	@Generatedvalue(strategy=GenerationType.AUTO)
	private long id;
	private String Name;
	private int age;
	private double Salary;
	private String Address;
	public Employee(long id, String name, int age, double salary, String address) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		Salary = salary;
		Address = address;
	}
	public Employee() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + ", Salary=" + Salary + ", Address=" + Address + "]";
	}
	
	
}
