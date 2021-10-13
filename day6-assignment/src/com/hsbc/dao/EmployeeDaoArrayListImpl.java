package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;

public class EmployeeDaoArrayListImpl implements EmployeeDao {

	private static List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		employeeList.add(employee);
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee employee = null;
		for (Employee e : employeeList) {
			if (e.getId() == id) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	@Override
	public Employee[] findAllEmployees() {
		Employee[] emp = employeeList.toArray(new Employee[employeeList.size()]);
		return emp;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		for (int i = 0; i <= employeeList.size(); i++) {
			if (employeeList.get(i).getId() == id) {
				employeeList.set(i, employee);
			}
		}
	}

}
