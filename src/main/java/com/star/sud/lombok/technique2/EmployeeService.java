package com.star.sud.lombok.technique2;

import com.star.sud.lombok.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeService {

	public Employee getEmployeeById(int id) {
		try {
			log.info("getEmployeeById");

			Employee emp = new Employee(1, "Sudarshan", "India");
			return emp;

		} catch (Exception e) {
			log.info("getEmployeeById", e);
			return null;
		}
	}

}
