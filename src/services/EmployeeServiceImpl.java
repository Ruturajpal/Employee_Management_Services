package com.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.employeemanagement.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> list;

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		list=new ArrayList<>();
		list.add(new Employee(17,"rohit","kapoor","rohit@gmail","19-08-2002","877419874",70000));
		list.add(new Employee(17,"ankit","lima","ankit@gmail","19-08-2002","877419874",20000));
		list.add(new Employee(17,"anshuman","jena","anshuman@gmail","19-08-2002","877419874",50000));
		list.add(new Employee(19,"alia","bhat","alia@gmail","30-08-2001","74194474",80000));
		
		return list;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		// TODO Auto-generated method stub
		Employee e=null;
		for(Employee employee:list) {
			if(employee.getId()==employeeId) {
				e=employee;
				break;
			}
		}
		return e;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		list.forEach( e->{
			if(e.getId()==employee.getId()) {
				e.setFirst_name(e.getFirst_name());
				e.setLast_name(e.getLast_name());
				e.setDoj(e.getDoj());
				e.setEmail(e.getEmail());
				e.setPhoneno(e.getPhoneno());
				e.setSalary(e.getSalary());
			}
		});
		return employee;
	}

	@Override
	public void deleteCourse(int parseInt) {
		list=this.list.stream().filter(e->e.getId()!=parseInt).collect(Collectors.toList());
		
	}
		
	}
		
	

	

