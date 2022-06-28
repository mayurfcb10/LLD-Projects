package com.carrental;

public class Location {
    String address;
    String city;
    String State;
    String country;
    String pinCode;

    public Location(String address, String city, String state, String country, String pinCode) {
        this.address = address;
        this.city = city;
        State = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return State;
    }
    public String getCountry() {
        return country;
    }
}
