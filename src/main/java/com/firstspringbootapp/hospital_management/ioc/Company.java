package com.firstspringbootapp.hospital_management.ioc;

public class Company {

    private int companyId;
    private String name;
    private Address address;

    public Company(int companyId, String name, Address address) {
        this.companyId = companyId;
        this.name = name;
        this.address = address;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
