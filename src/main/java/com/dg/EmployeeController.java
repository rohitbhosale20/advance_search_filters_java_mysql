package com.dg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	 @Autowired
	    private EmployeeService employeeService;

	    @GetMapping("/search")
	    public List<Employee> searchEmployees(@RequestParam(required = false) String name,
	                                          @RequestParam(required = false) String jobTitle,
	                                          @RequestParam(required = false) String companyName,
	                                          @RequestParam(required = false) String companySize,
	                                          @RequestParam(required = false) String country) {
	        return employeeService.searchEmployees(name, jobTitle, companyName, companySize, country);
	    }
}
