package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private int number;
    @NotNull
    private String position;
    @NotNull
    private int floor;
    @NotNull
    private Integer dailyPrice;
    @NotNull
    private Boolean smoker;
    @NotNull
    private int qtdPeople;
    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusRoom status;
}
