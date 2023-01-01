package com.projeto.hotel.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
