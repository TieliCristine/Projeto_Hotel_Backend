package com.projeto.hotel.controller;

import com.projeto.hotel.model.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/office")
public class OfficeController {

    @Autowired
    private OfficeRepository officeRepository;
}
