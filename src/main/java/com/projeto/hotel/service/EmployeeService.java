package com.projeto.hotel.service;

import com.projeto.hotel.model.entity.Employee;
import com.projeto.hotel.model.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee){

        return employeeRepository.save(employee);
    }

    public List<Employee> list(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee update(Employee employee){
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        existingEmployee.setCpf(employee.getCpf());
        existingEmployee.setName(employee.getName());
        existingEmployee.setBirthdate(employee.getBirthdate());
        existingEmployee.setGender(employee.getGender());
        existingEmployee.setMobile(employee.getMobile());
        existingEmployee.setOffice(employee.getOffice());
        return employeeRepository.save(existingEmployee);
    }

    public String delete(Long id){
        employeeRepository.deleteById(id);
        return "Funcinário excluído com sucesso!" + id;
    }
}
