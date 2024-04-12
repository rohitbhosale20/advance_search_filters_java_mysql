package com.dg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

	  @Autowired
	    private EmployeeRepository employeeRepository;

	    public List<Employee> searchEmployees(String name, String jobTitle, String companyName, String companySize, String country) {
	        // Implement your search logic here using employeeRepository
	        return employeeRepository.findAll(); // For demonstration purpose, returning all employees
	    }
}
