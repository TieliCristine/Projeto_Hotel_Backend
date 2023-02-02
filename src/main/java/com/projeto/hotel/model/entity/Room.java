package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Data
@NoArgsConstructor
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private int number;
    @Column(nullable = false)
    private String position;
    @Column(nullable = false)
    private int floor;
    @Column(nullable = false)
    private Integer dailyPrice;
    @Column(nullable = false)
    private Boolean smoker;
    @Column(nullable = false)
    private int qtdPeople;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusRoom status;
}
