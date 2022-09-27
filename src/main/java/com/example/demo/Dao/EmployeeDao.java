package com.example.demo.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

import antlr.collections.List;

public interface EmployeeDao extends JpaRepository<Employee, Long> {


}