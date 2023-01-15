package com.projeto.hotel.service;

import com.projeto.hotel.model.entity.Access;
import com.projeto.hotel.model.repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessService {

    @Autowired
    private AccessRepository accessRepository;

    public Access save(Access access){
        return accessRepository.save(access);
    }

    public Access findById(Long id){
        return accessRepository.findById(id).orElse(null);
    }

    public Access update(Access access){
        Access existingAccess = accessRepository.findById(access.getId()).orElse(null);
        existingAccess.setEmail(access.getEmail());
        existingAccess.setPassword(access.getPassword());
        return accessRepository.save(existingAccess);
    }

    public String delete(Long id){
        accessRepository.deleteById(id);
        return "Acesso excluído com sucesso!" + id;
    }
}
