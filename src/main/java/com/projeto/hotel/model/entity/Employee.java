package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Date birthdate;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String mobile;
    @Column(nullable = false)
    private String office;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    private Access access;
}
