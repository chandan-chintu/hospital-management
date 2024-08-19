package com.firstspringbootapp.hospital_management.ioc;

public class Address {

    private int doorNo;
    private String streetName;
    private String city;

    public Address(int doorNo, String streetName, String city) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.city = city;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


