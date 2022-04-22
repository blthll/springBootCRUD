package com.example.halil.springbootcrud.springBootCRUD.service;

import java.util.List;

import com.example.halil.springbootcrud.springBootCRUD.model.Employee;

public interface EmployeeService {
	List<Employee>get ();
	Employee get (int id);
	void save (Employee employee);
	void delete (int id);
}
