package org.jetBrains.oop.concepts.transientkeyword.innerpackage;

import java.io.Serializable;

 public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    private String state;
    private String city;
    private String street;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}