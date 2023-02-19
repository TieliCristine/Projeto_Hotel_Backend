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
    @Column(unique = true)
    @NotNull
    private String cpf;
    @NotNull
    private String name;
    @NotNull
    private Date birthdate;
    @NotNull
    private String gender;
    @NotNull
    private String mobile;
    @NotNull
    private String office;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Access access;
}
