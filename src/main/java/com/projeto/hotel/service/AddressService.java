package com.projeto.hotel.service;

import com.projeto.hotel.model.entity.Address;
import com.projeto.hotel.model.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address save(Address address){
        return addressRepository.save(address);
    }

    public List<Address> list() {
        return addressRepository.findAll();
    }

    public Address update(Address address){
        Address existingAddress = addressRepository.findById(address.getId()).orElse(null);
        existingAddress.setZipCode(address.getZipCode());
        existingAddress.setStreet(address.getStreet());
        existingAddress.setNumber(address.getNumber());
        existingAddress.setSupplemental(address.getSupplemental());
        existingAddress.setDistrict(address.getDistrict());
        existingAddress.setCity(address.getCity());
        existingAddress.setState(address.getState());
        return addressRepository.save(existingAddress);
    }
}
