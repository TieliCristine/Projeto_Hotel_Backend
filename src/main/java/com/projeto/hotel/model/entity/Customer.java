package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
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

    @OneToOne
    private Address address;
    @OneToOne
    private Access access;

    /*-----------------------------------------------*  CONSTRUCTORS  *-----------------------------------------------*/

    public Customer(Long id, String cpf, String name, Date birthdate, String gender, String mobile, Address address, Access access) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
        this.access = access;
    }

    public Customer() {

    }

    /*-------------------------------------------*  GETTERS AND SETTERS  *--------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }
}
