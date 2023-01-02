package com.projeto.hotel.controller;

import com.projeto.hotel.model.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reserve")
public class ReserveController {

    @Autowired
    private ReserveRepository reserveRepository;
}
