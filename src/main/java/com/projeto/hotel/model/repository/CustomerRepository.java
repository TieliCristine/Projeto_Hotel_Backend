package com.projeto.hotel.model.repository;

import com.projeto.hotel.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
