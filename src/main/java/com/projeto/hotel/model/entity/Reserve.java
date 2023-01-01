package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "reserve")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private int people;
    @NotNull
    private int nights;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull
    private Integer price;

    @OneToOne
    private Room room;
    @OneToOne
    private Customer customer;
    @OneToOne
    private Employee employee;

    /*-----------------------------------------------*  CONSTRUCTORS  *-----------------------------------------------*/

    public Reserve(Long id, int people, int nights, Status status, Integer price, Room room, Customer customer,
                   Employee employee) {
        this.id = id;
        this.people = people;
        this.nights = nights;
        this.status = status;
        this.price = price;
        this.room = room;
        this.customer = customer;
        this.employee = employee;
    }

    public Reserve(){

    }

    /*-------------------------------------------*  GETTERS AND SETTERS  *--------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
