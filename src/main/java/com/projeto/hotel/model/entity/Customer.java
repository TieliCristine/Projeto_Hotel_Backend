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
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
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
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Access access;
}
