package com.Employee.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Employee.Entity.Employee;
import com.Employee.Repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	@Autowired
	EmployeeRepository er;

	public String postEmp(Employee e2) {
		er.save(e2);
		return "Saved Sucessfully";
	}

	// get the list of Employee details:Using findAll():
	public List<Employee> empAllDetail() {
		return er.findAll();
	}

	// find mentioned employee details:using finById():
	public Employee empdFindDetail(int a) {
		return er.findById(a).get();
	}

	// Deleting one particular employee object:using deleteById():
	public String empDeleteDetail(int a) {
		er.deleteById(a);
		return "Deleted Sucessfully";
	}

	// Using @PutMapping delete the 5th employee details and replace another
	// details:
	public String updateEmpDetail(int a, Employee e) {
		// getting the particular employee details using findById():
		Employee x = er.findById(a).get();

		// setting the details from new object details using getter():
		x.setName(e.getName());
		x.setAge(e.getAge());
		x.setGender(e.getGender());
		x.setSalary(e.getSalary());
		x.setRole(e.getRole());

		// Using save() to save the updated details
		er.save(x);
		return "Updated Sucessfully";
	}
	
	// Using @PatchMapping change the 7th employee name details and replace name another details:
	public String updateEmpNameDetail(int a, Employee e) {
		// getting the particular employee details using findById():
		Employee x = er.findById(a).get();

		// setting the details from new object details using getter():
		x.setName(e.getName());
		er.save(x);
		return "Udated Name Sucessfully";
	}
	
	//using @GetMapping to get the Toper from the table details:
	
	
}
