package com.projeto.hotel.model.repository;

import com.projeto.hotel.model.entity.Reserve;
import com.projeto.hotel.model.entity.StatusReserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Long> {
    Reserve findByStatus(StatusReserve statusReserve);

}
