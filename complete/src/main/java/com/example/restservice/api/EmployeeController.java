package com.example.restservice.api;

import java.util.List;

import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
	EmployeeService empService = new EmployeeService();
	//GET All Employee list
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}

	//GET Employee by id
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id){
		return empService.getById(id);
	}

	//POST
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee){
		empService.addEmployee(employee);
		return employee;
	}
}
