package com.projeto.hotel.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "admin")
public class Admin extends Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Office office;

    /*-----------------------------------------------*  CONSTRUCTORS  *-----------------------------------------------*/

    public Admin(Long id, String cpf, String name, Date birthdate, String gender, String mobile, Address address,
                 Access access, Office office, Long id1, Office office1) {
        super(id, cpf, name, birthdate, gender, mobile, address, access, office);
        this.id = id1;
        this.office = office1;
    }

    public Admin(Long id, Office office) {
        this.id = id;
        this.office = office;
    }

    public Admin(){

    }

    /*-------------------------------------------*  GETTERS AND SETTERS  *--------------------------------------------*/

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Office getOffice() {
        return office;
    }

    @Override
    public void setOffice(Office office) {
        this.office = office;
    }
}
