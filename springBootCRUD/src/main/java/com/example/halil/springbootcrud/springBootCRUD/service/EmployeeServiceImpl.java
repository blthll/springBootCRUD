package com.example.halil.springbootcrud.springBootCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.halil.springbootcrud.springBootCRUD.dao.EmployeeDAO;
import com.example.halil.springbootcrud.springBootCRUD.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	@Transactional
	@Override
	public List<Employee> get() {
		
		return employeeDAO.get(); 
	}
	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDAO.save(employee);
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
