package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;

	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = (EmployeeDao) dao;
	}

	@Override
	public void store(Employee employee) throws EmployeeAlreadyExistsException {
		Employee[] emp = dao.findAllEmployees();
		for (Employee e : emp) {
			if (e.getId() == employee.getId()) {
				throw new EmployeeAlreadyExistsException("The Employee with " + e.getId() + " already exists");
			}
		}
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if (emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " + id + " not found");
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee employee = findEmployee(id);
		employee.setSalary(salary);
		dao.updateEmployee(id, employee);
	}

	@Override
	public void updateName(int id, String name) throws EmployeeNotFoundException {
		Employee employee = findEmployee(id);
		employee.setName(name);
		dao.updateEmployee(id, employee);
	}

}