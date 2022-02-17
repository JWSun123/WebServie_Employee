package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    List<Employee> employees =  new ArrayList<>();
    public List<Employee> getAllEmployee(){
        Employee employee1 = new Employee(1, "Harry", "Potter",
                new Address(4, "Privet Drive", "H3H2N8"));
        Employee employee2 = new Employee(2, "Ron", "Weasley",
                new Address(1, "The Burrow", "J3J2J2"));
        Employee employee3 = new Employee(3, "Hermione", "Granger",
                new Address(88, "Hampstead Garden", "1W23J2"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
    public Employee getById(int id){
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
