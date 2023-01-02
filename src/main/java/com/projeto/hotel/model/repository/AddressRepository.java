package com.projeto.hotel.model.repository;

import com.projeto.hotel.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
