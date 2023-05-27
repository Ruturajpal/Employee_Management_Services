package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployee();

	Employee getEmployee(int parseInt);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteCourse(int parseInt);

	
}
