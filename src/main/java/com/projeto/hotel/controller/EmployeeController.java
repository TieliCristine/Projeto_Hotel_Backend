package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Employee;
import com.projeto.hotel.service.EmployeeService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Validated
@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public @ResponseBody List<Employee> list(){
        return employeeService.list();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Employee save(@RequestBody @Valid Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping(value = "/{id}")
    public Employee findById(@PathVariable @NotNull @Positive Long id){
        return employeeService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public Employee update(@PathVariable @NotNull @Positive Long id ,@RequestBody @Valid Employee employee){
        return employeeService.update(id, employee);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable @NotNull @Positive Long id){
        employeeService.delete(id);
    }
}
