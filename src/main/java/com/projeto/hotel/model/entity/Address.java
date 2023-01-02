package com.projeto.hotel.model.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String zipCode;
    @NotNull
    private String street;
    @NotNull
    private int number;
    private String supplemental;
    @NotNull
    private String district;
    @NotNull
    private String city;
    @NotNull
    private String state;

    /*-----------------------------------------------*  CONSTRUCTORS  *-----------------------------------------------*/

    public Address(long id, String zipCode, String street, int number, String supplemental,
                   String district, String city, String state) {
        this.id = id;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
        this.supplemental = supplemental;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public Address(){

    }

    /*-------------------------------------------*  GETTERS AND SETTERS  *--------------------------------------------*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSupplemental() {
        return supplemental;
    }

    public void setSupplemental(String supplemental) {
        this.supplemental = supplemental;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
