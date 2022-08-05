package com.BikkadIT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIT.model.Employee;
import com.BikkadIT.repository.EmployeeRepository;

public class ServiceImpl implements ServiceI {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public int addEmployee(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return save.getEmpId();
	}

	@Override
	public List<Employee> addMultipleEmployee(List<Employee >employee) {
      List<Employee> saveAll = employeeRepository.saveAll(employee);
	return saveAll;
	}


	@Override
	public Employee getById(int empId) {
	Employee id = employeeRepository.findById(empId).get();
	return id;
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> findAll = employeeRepository.findAll();
		System.out.println(findAll);
		return findAll;
	}


	@Override
	public int updateEmployee(Employee employee) {
		Employee update = employeeRepository.save(employee);
		return update.getEmpId();
	}


	@Override
	public void deleteEmployee(int empId) {
		employeeRepository.deleteById(empId);
		
	}

	@Override
	public void deleteAllEmployee(Employee employee) {
		employeeRepository.deleteAll();
		
	}

	@Override
	public Employee loginCheck(Employee employee) {
		Employee login = employeeRepository.findByEmpNameAndEmpEmail(employee.getEmpName(), employee.getEmpEmail());
		return login;
	}

	@Override
	public List<Employee> findByEmpAgeLessThanEqual(int empAge) {
		List<Employee> ageoflist = employeeRepository.findByEmpAgeLessThanEqual(empAge);
		return ageoflist;
	}

	@Override
	public List<Employee> updateMultipleEmployee(List<Employee> employee) {
		List<Employee> updateAll = employeeRepository.saveAll(employee);
		return updateAll;
	}

	

}
