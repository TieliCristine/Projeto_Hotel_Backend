package com.projeto.hotel.controller;

import com.projeto.hotel.model.entity.Access;
import com.projeto.hotel.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/access")
public class AccessController {

    @Autowired
    private AccessService accessService;

    @PostMapping(value = "/registerAccess")
    public Access save(@RequestBody Access access){
        return accessService.save(access);
    }

    @GetMapping(value = "/findAccessById/{id}")
    public Access findById(@PathVariable Long id){
        return accessService.findById(id);
    }

    @PutMapping(value = "/editAccess")
    public Access update(@RequestBody Access access){
        return accessService.save(access);
    }

    @DeleteMapping(value = "/deleteAccess/{id}")
    public String delete(@PathVariable Long id){
        return accessService.delete(id);
    }

}
