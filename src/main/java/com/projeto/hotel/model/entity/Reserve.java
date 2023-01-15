package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "reserve")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private int qtdPeople;
    @NotNull
    private Date checkin;
    @NotNull
    private Date checkout;
    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusReserve status;
    @NotNull
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
