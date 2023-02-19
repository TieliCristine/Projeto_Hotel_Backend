package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.Length;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Data
@NoArgsConstructor
@SQLDelete(sql = "UPDATE Employee SET status = 'Inativo' WHERE id = ?")
@Where(clause = "status = 'Ativo'")
@Entity
@Table(name = "employee")
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @Length(min = 11, max = 11)
    @Column(unique = true, length = 11, nullable = false)
    private String cpf;

    @NotBlank
    @NotNull
    @Length(min = 5, max = 225)
    @Column(length = 225, nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private Date birthdate;

    @NotNull
    @Pattern(regexp = "Feminino|Masculino|Não Informar")
    @Column(length = 12, nullable = false)
    private String gender;

    @NotBlank
    @NotNull
    @Length(min = 5, max = 225)
    @Column(length = 12, nullable = false)
    private String mobile;

    @NotNull
    @Length(max = 10)
    @Pattern(regexp = "Ativo|Inativo")
    @Column(length = 10, nullable = false)
    private String status = "Ativo";

    @NotNull
    @Length(max = 15)
    @Column(length = 15, nullable = false)
    private String office;

//    @NotNull
//    @OneToOne(cascade = CascadeType.ALL)
//    private Address address;
//    @NotNull
//    @OneToOne(cascade = CascadeType.ALL)
//    private Access access;
}
