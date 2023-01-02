package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private int number;
    @NotNull
    private String position;
    @NotNull
    private int floor;
    @NotNull
    private Integer dailyPrice;
    @NotNull
    private Boolean smoker;
    @NotNull
    private int people;
    @NotNull
    private Boolean status;

    /*-----------------------------------------------*  CONSTRUCTORS  *-----------------------------------------------*/

    public Room(Long id, int number, String position, int floor, Integer dailyPrice,
                Boolean smoker, int people, Boolean status) {
        this.id = id;
        this.number = number;
        this.position = position;
        this.floor = floor;
        this.dailyPrice = dailyPrice;
        this.smoker = smoker;
        this.people = people;
        this.status = status;
    }

    public Room() {
    }

    /*-------------------------------------------*  GETTERS AND SETTERS  *--------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Integer getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(Integer dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public Boolean getSmoker() {
        return smoker;
    }

    public void setSmoker(Boolean smoker) {
        this.smoker = smoker;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
