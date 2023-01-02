package com.projeto.hotel.model.repository;

import com.projeto.hotel.model.entity.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
}
