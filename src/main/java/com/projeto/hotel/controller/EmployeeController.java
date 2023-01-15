package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Employee;
import com.projeto.hotel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/registerEmployee")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> list(){
        return employeeService.list();
    }

    @GetMapping(value = "/findEmployeeById/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @PutMapping(value = "/editEmployee")
    public Employee update(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping(value = "/deleteEmployee/{id}")
    public String delete(@PathVariable Long id){
        return employeeService.delete(id);
    }
}
