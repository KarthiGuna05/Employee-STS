package com.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Employee.DAO.EmployeeDAO;
import com.Employee.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO ed;

	public String postEmp(Employee e1) {
		return ed.postEmp(e1);
	}

	// get the list of Employee details:Using findAll():
	public List<Employee> empAllDetail() {
		return ed.empAllDetail();
	}

	// find mentioned employee details:using finById():
	public Employee empdFindDetail(int a) {
		return ed.empdFindDetail(a);
	}

	// Deleting one particular employee object:using deleteById():
	public String empDeleteDetail(int a) {
		return ed.empDeleteDetail(a);
	}

	// Using @PutMapping delete the 5th employee details and replace another details:
	public String updateEmpDetail(int a, Employee e) {
		return ed.updateEmpDetail(a, e);
	}
	
	// Using @PatchMapping change the 7th employee name details and replace name another details:
	public String updateEmpNameDetail(int a,Employee e) {
		return ed.updateEmpNameDetail(a,e);
	}
}
