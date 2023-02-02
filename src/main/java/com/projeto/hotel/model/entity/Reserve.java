package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "reserve")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int qtdPeople;
    @Column(nullable = false)
    private Date checkin;
    @Column(nullable = false)
    private Date checkout;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusReserve status;
    @Column(nullable = false)
    private Integer price;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
