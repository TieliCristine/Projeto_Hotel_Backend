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
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String zipCode;
    @NotNull
    private String street;
    @NotNull
    private int number;
    private String supplemental;
    @NotNull
    private String district;
    @NotNull
    private String city;
    @NotNull
    private String state;
}
