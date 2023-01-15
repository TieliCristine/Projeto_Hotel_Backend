package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Customer;
import com.projeto.hotel.model.entity.Reserve;
import com.projeto.hotel.model.entity.StatusReserve;
import com.projeto.hotel.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reserve")
public class ReserveController {

    @Autowired
    private ReserveService reserveService;

    @PostMapping(value = "/registerReserve")
    public Reserve save(@RequestBody Reserve reserveForm){
        return reserveService.save(reserveForm);
    }

    @GetMapping
    public List<Reserve> list(){
        return reserveService.list();
    }

//    @GetMapping(value = "/findReserveByCpf")
//    public Customer findByCpf(@PathVariable String cpf){
//        return reserveService.findByCpf(cpf);
//    }

    @GetMapping(value = "/findReserveByStatus")
    public Reserve findByStatus(@PathVariable StatusReserve statusReserve){
        return reserveService.findByStatus(statusReserve);
    }

    @PutMapping(value = "editReserve")
    public Reserve update(@RequestBody Reserve reserve){
        return reserveService.save(reserve);
    }

    @DeleteMapping(value = "/deleteReserve/{id}")
    public String delete(@PathVariable Long id){
        return reserveService.delete(id);
    }
}
