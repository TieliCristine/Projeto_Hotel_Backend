package com.projeto.hotel.model.repository;

import com.projeto.hotel.model.entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//public interface AccessRepository extends JpaRepository<Access, Long> {

    @Component
    public class AccessRepository{

    private static Map<Long, Access> map = new HashMap<>();

    public void save (Access obj){
        map.put(obj.getId(), obj);
    }

    public static Access findById(Long id){
        return map.get(id);
    }

    public static List<Access> findAll(){
        return new ArrayList<Access>(map.values());
    }

}
