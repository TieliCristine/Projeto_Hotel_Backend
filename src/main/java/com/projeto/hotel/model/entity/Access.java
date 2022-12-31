package com.projeto.hotel.model.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "access")
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String password;

    public Access(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Access() {

    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Access)) return false;
        Access access = (Access) o;
        return id.equals(access.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
