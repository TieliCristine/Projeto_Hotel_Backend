package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 11, nullable = false)
    private String cpf;

    @Column(length = 225, nullable = false)
    private String name;

    @Column(nullable = false)
    private Date birthdate;

    @Column(length = 12, nullable = false)
    private String gender;

    @Column(length = 12, nullable = false)
    private String mobile;



//    @NotNull
//    @OneToOne(cascade = CascadeType.ALL)
//    private Address address;
//    @NotNull
//    @OneToOne(cascade = CascadeType.ALL)
//    private Access access;
}
