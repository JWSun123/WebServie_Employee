package com.example.restservice.model;

public class Address {
    private int number;
    private String streetName;
    private String codePostal;

    public Address() {
    }

    public Address(int number, String streetName, String codePostal) {
        this.number = number;
        this.streetName = streetName;
        this.codePostal = codePostal;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", streetName='" + streetName + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }
}
