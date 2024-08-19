package com.firstspringbootapp.hospital_management.ioc;

public class MainApp {

    // tight coupling - one object depending on another
    Address address1 = new Address(1200, "XYZPQR","SJOWOW");
    Address address2 = new Address(234, "ajisoso","skisisi");
    Company company1 = new Company(123, "test abc",address1);
    Company company2 = new Company(234, "ksika abc",address2);
}
