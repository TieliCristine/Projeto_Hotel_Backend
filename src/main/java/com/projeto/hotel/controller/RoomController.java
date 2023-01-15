package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Room;
import com.projeto.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping(value = "/registerRoom")
    public Room save(@RequestBody Room room){
        return roomService.save(room);
    }

    @GetMapping
    public List<Room> list(){
        return roomService.list();
    }

    @GetMapping(value = "/findRoomById/{id}")
    public Room findById(@PathVariable Long id){
        return roomService.findById(id);
    }

//    @GetMapping(value = "/findRoomByStatus/{id}")
//    public Room findByStatus(@PathVariable Long id){
//        return roomService.findByStatus(id);
//    }

    @PutMapping(value = "/editRoom")
    public Room update(@RequestBody Room room){
        return roomService.save(room);
    }

    @DeleteMapping("/deleteRoom/{id}")
    public String delete(@PathVariable Long id){
        return roomService.delete(id);
    }
}
