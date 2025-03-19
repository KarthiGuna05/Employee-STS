package com.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping(value = "/postSingleEmp")
	public String postEmp(@RequestBody Employee e) {

		return es.postEmp(e);
	}

	// get the list of Employee details:Using findAll():
	@GetMapping(value = "/getAllEmpDetails")
	public List<Employee> empAllDetail() {
		return es.empAllDetail();
	}

	// find mentioned employee details:using finById():
	@GetMapping(value = "/empFindDetail/{a}")
	public Employee empdFindDetail(@PathVariable int a) {
		return es.empdFindDetail(a);
	}

	// Deleting one particular employee object:using deleteById():
	@GetMapping(value = "/empDeleteDetail/{a}")
	public String empDeleteDetail(@PathVariable int a) {
		return es.empDeleteDetail(a);
	}

	// Using @PutMapping delete the 5th employee details and replace another
	// details:
	@PutMapping(value = "/updateEmpDetail/{a}")
	public String updateEmpDetail(@PathVariable int a, @RequestBody Employee e) {
		return es.updateEmpDetail(a, e);
	}

	// Using @PatchMapping change the 7th employee name details and replace name
	// another details:
	@PatchMapping(value = "/updateEmpNameDetail/{a}")
	public String updateEmpNameDetail(@PathVariable int a, @RequestBody Employee e) {
		return es.updateEmpNameDetail(a, e);
	}
}
