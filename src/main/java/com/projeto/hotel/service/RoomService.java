package com.projeto.hotel.service;

import com.projeto.hotel.model.entity.Room;
import com.projeto.hotel.model.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public Room save(Room room){
        return roomRepository.save(room);
    }

    public List<Room> list(){
        return roomRepository.findAll();
    }

    public Room findById(Long id){
        return roomRepository.findById(id).orElse(null);
    }

//    public Room findByStatus(StatusRoom statusRoom) {
//        return roomRepository.
//    }

    public Room update(Room room){
        Room existingRoom = roomRepository.findById(room.getId()).orElse(null);
        existingRoom.setNumber(room.getNumber());
        existingRoom.setPosition(room.getPosition());
        existingRoom.setFloor(room.getFloor());
        existingRoom.setDailyPrice(room.getDailyPrice());
        existingRoom.setSmoker(room.getSmoker());
        existingRoom.setQtdPeople(room.getQtdPeople());
        existingRoom.setStatus(room.getStatus());
        return roomRepository.save(existingRoom);
    }

    public String delete(Long id){
        roomRepository.deleteById(id);
        return "Quarto excluido com sucesso!" + id;
    }
}
