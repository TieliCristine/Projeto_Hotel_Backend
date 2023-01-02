package com.projeto.hotel.model.repository;

import com.projeto.hotel.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
