package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Address;
import com.projeto.hotel.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> list(){
        return addressService.list();
    }

    @PostMapping(value = "/registerAddress")
    public Address save(@RequestBody Address address){
        return addressService.save(address);
    }

    @PutMapping(value = "/editAddress")
    public Address update(@RequestBody Address address){
        return addressService.save(address);
    }
}
