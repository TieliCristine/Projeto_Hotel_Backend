package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Customer;
import com.projeto.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/registerCustomer")
    public Customer save(@RequestBody Customer customerForm){
        return customerService.save(customerForm);
    }

    @GetMapping
    public List<Customer> list(){
        return customerService.list();
    }

    @GetMapping(value = "/findCustomerById/{id}")
    public Customer findById(@PathVariable Long id){
        return customerService.findById(id);

    }    @GetMapping(value = "/findCustomerByCpf/{cpf}")
    public Customer findByCpf(@PathVariable String cpf){
        return customerService.findByCpf(cpf);
    }

    @PutMapping(value = "/editCustomerByCpf/{cpf}")
    public Customer update(@RequestBody Customer customer){
        return customerService.save(customer);
    }
}
