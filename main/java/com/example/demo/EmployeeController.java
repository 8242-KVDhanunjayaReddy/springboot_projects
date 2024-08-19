package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api")

public class EmployeeController {
   @Autowired
    private EmployeeRepository employeeRepository;
    private int id;
    @GetMapping("/employees")
  // @RequestMapping(value = "/employees",method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable long id,@RequestBody Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmailId(employee.getEmailId());
        return employeeRepository.save(existingEmployee);
    }

    @DeleteMapping("/employees")

    public void deleteEmployee(@PathVariable long id) {
        employeeRepository.deleteById(id);
    }
}
