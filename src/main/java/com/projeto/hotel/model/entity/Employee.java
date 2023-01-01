package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "cpf", unique = true)
    @NotNull
    private String cpf;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "birthdate")
    @NotNull
    private Date birthdate;
    @Column(name = "gender")
    @NotNull
    private String gender;
    @Column(name = "mobile")
    @NotNull
    private String mobile;

    @OneToOne
    private Address address;
    @OneToOne
    private Access access;
    @ManyToOne
    private Office office;

    /*-----------------------------------------------*  CONSTRUCTORS  *-----------------------------------------------*/

    public Employee(Long id, String cpf, String name, Date birthdate, String gender,
                    String mobile, Address address, Access access, Office office) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
        this.access = access;
        this.office = office;
    }

    public Employee(){

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

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
