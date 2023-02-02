package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Calendar;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Calendar birthdate;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String mobile;

//    @Column(nullable = false)
//    @OneToOne(cascade = CascadeType.ALL)
//    private Address address;
//    @Column(nullable = false)
//    @OneToOne(cascade = CascadeType.ALL)
//    private Access access;
}
