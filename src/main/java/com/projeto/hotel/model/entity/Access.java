package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "access")
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    private String password;

    /*-----------------------------------------------*  CONSTRUCTORS  *-----------------------------------------------*/

    public Access(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Access() {
    }

    /*-------------------------------------------*  GETTERS AND SETTERS  *--------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
