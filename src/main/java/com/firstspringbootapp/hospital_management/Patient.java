package com.firstspringbootapp.hospital_management;

public class Patient {

    private int patientId;
    private String name;
    private String disease;
    private int age;
    private String gender;
    private String mobile;

    public Patient(int patientId, String name, String disease, int age, String gender, String mobile) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
