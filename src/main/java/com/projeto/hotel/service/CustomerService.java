package com.projeto.hotel.service;

import com.projeto.hotel.model.entity.Customer;
import com.projeto.hotel.model.repository.CustomerRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import java.util.List;
import java.util.Optional;

@Validated
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> list() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findById(@NotNull @Positive Long id) {
        return customerRepository.findById(id);
    }

    public Customer save(@Valid Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> update(@NotNull @Positive Long id, @Valid Customer customer) {
        return customerRepository.findById(id)
                .map(recordFound -> {
                    recordFound.setCpf(customer.getCpf());
                    recordFound.setName(customer.getName());
                    recordFound.setBirthdate(customer.getBirthdate());
                    recordFound.setGender(customer.getGender());
                    recordFound.setMobile(customer.getMobile());
                    return customerRepository.save(recordFound);
                });
    }

    public boolean delete(@NotNull @Positive Long id) {
        return customerRepository.findById(id)
                .map(recordFound -> {
                    customerRepository.deleteById(id);
                    return true;
                })
                .orElse(false);
    }

}