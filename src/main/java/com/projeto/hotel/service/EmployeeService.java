package com.projeto.hotel.service;

import com.projeto.hotel.exception.RecordNotFoundException;
import com.projeto.hotel.model.entity.Employee;
import com.projeto.hotel.model.repository.EmployeeRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> list(){
        return employeeRepository.findAll();
    }

    public Employee findById(@NotNull @Positive Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Employee save(@Valid Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee update(@NotNull @Positive Long id, @Valid Employee employee){
        return employeeRepository.findById(id).map(recordFound -> {
            recordFound.setCpf(employee.getCpf());
            recordFound.setName(employee.getName());
            recordFound.setBirthdate(employee.getBirthdate());
            recordFound.setGender(employee.getGender());
            recordFound.setMobile(employee.getMobile());
            recordFound.setOffice(employee.getOffice());
        return employeeRepository.save(recordFound);
        }).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public void delete(@NotNull @Positive Long id){
        employeeRepository.delete(employeeRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(id)));
    }
}
