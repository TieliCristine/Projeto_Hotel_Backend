package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Customer;
import com.projeto.hotel.model.repository.CustomerRepository;
import com.projeto.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public @ResponseBody List<Customer> list() {
        return customerService.list();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        return customerRepository.findById(id)
                .map(recordFound -> ResponseEntity.ok().body(recordFound))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer) {
        return customerRepository.findById(id)
                .map(recordFound -> {
                    recordFound.setCpf(customer.getCpf());
                    recordFound.setName(customer.getName());
                    recordFound.setBirthdate(customer.getBirthdate());
                    recordFound.setGender(customer.getGender());
                    recordFound.setMobile(customer.getMobile());
                    recordFound = customerService.update(recordFound);
//                    customerService.update(recordFound);
                    Customer updated = customerService.save(recordFound);
                    return ResponseEntity.ok().body(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return customerRepository.findById(id)
                .map(recordFound -> {
           customerRepository.deleteById(id);
            return ResponseEntity.noContent().<Void>build();
        })
                .orElse(ResponseEntity.notFound().build());
    }


//    @GetMapping(value = "/{cpf}")
//    public Customer findByCpf(@PathVariable String cpf) {
//        return customerService.findByCpf(cpf);
//    }
//
//    @PutMapping(value = "/{cpf}")
//    public Customer updateByCpf(@RequestBody Customer customer) {
//        return customerService.save(customer);
//    }
}
