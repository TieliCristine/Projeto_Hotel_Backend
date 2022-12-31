package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Access;
import com.projeto.hotel.model.repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/access")
public class AccessController {

    @Autowired
    private AccessRepository accessRepository;

    @GetMapping
    public ResponseEntity<List<Access>> findAll(){
        List<Access> list = AccessRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Access> findById(@PathVariable Long id){
        Access lista = AccessRepository.findById(id);
        return ResponseEntity.ok().body(lista);
    }

}
