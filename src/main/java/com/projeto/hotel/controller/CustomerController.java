package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Customer;
import com.projeto.hotel.service.CustomerService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Validated
@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public @ResponseBody List<Customer> list() {
        return customerService.list();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Customer save(@RequestBody @Valid Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer findById(@PathVariable @NotNull @Positive Long id) {
        return customerService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public Customer update(@PathVariable  @NotNull @Positive Long id, @RequestBody @Valid Customer customer) {
        return customerService.update(id, customer);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable  @NotNull @Positive Long id) {
        customerService.delete(id);
    }
}
