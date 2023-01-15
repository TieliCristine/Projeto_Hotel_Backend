package com.projeto.hotel.service;

import com.projeto.hotel.model.entity.Customer;
import com.projeto.hotel.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customerForm){
        return customerRepository.save(customerForm);
    }

    public List<Customer> list(){
        return customerRepository.findAll();
    }

    public Customer findById(Long id){
        return customerRepository.findById(id).orElse(null);
    }

//    public Customer findByCpf(String cpf){
//        return customerRepository.findByCpf(cpf).orElse(null);
//    }

    public Customer findByCpf(String cpf) {
        return customerRepository.findByCpf(cpf)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário não encontrado"));
    }

    public Customer update(Customer customer){
        Customer existingCustomer = customerRepository.findByCpf(customer.getCpf()).orElse(null);
        existingCustomer.setCpf(customer.getCpf());
        existingCustomer.setName(customer.getName());
        existingCustomer.setBirthdate(customer.getBirthdate());
        existingCustomer.setGender(customer.getGender());
        existingCustomer.setMobile(customer.getMobile());
        existingCustomer.setAddress(customer.getAddress());
        existingCustomer.setAccess(customer.getAccess());
        return customerRepository.save(existingCustomer);
    }

}