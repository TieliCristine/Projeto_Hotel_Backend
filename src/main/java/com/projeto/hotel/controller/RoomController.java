package com.projeto.hotel.controller;

import com.projeto.hotel.model.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/room")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;
}
