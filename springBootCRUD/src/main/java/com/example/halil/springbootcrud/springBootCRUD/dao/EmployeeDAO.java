package com.example.halil.springbootcrud.springBootCRUD.dao;

import java.util.List;

import com.example.halil.springbootcrud.springBootCRUD.model.Employee;

public interface EmployeeDAO {
	
	List<Employee>get ();
	Employee get (int id);
	void save (Employee employee);
	void delete (int id);
	

}
