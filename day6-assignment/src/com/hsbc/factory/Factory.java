package com.hsbc.factory;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayListImpl;
import com.hsbc.dao.EmployeeDaoImpl;
import com.hsbc.dao.EmployeeDaoTreeSetImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class Factory {

	public EmployeeDao getDaoInstance(int option) {
		EmployeeDao dao = null;
		switch(option) {
			case 1: 
				dao = new EmployeeDaoImpl();
				break;
			case 2: 
				dao = new EmployeeDaoArrayListImpl();
				break;
			case 3:
				dao = new EmployeeDaoTreeSetImpl();
				break;
				
		}
		if(dao == null) {
			dao = new EmployeeDaoImpl();
		}
		return dao;
	}
	
	public EmployeeService getServiceInstance(EmployeeDao dao) {
		return new EmployeeServiceImpl(dao);
	}
}
