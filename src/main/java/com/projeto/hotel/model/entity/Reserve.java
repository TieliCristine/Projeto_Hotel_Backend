package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "reserve")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @NotNull
    private int people;
    @NotNull
    private int nights;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull
    private Integer price;

    @OneToOne
    private Room room;
    @OneToOne
    private Customer customer;
    @OneToOne
    private Employee employee;
}
