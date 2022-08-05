package com.BikkadIT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.model.Employee;

public interface EmployeeRepository  extends  JpaRepository<Employee, Integer>{

	public Employee findByEmpId(int empId);
	public Employee findByEmpNameAndEmpEmail(String empName,String empEmail);
	public List<Employee>  findByEmpAgeLessThanEqual(int empAge);
}
