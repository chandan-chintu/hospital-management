package com.firstspringbootapp.hospital_management;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    // database used here is hashmap
    HashMap<Integer, Doctor> doctorDB = new HashMap<>();


    // writing our first API
    // this API add doctors into hashmap database which we created above
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor) {
        int doctorId = doctor.getDoctorId();
        doctorDB.put(doctorId, doctor);

        return "Doctor added successfully";
    }

    // this API gets the doctors present inside HashMap and displays it
    @GetMapping("/getAllDoctors")
    public HashMap<Integer, Doctor> getAllDoctors() {
        return doctorDB;
    }

    // this API gets the doctors present inside HashMap with id and displays it
    // @PathVariable - it takes the input inside the url path
    @GetMapping("/getById/{doctorid}")
    public Doctor getDoctorById(@PathVariable("doctorid") int doctorId) {
        Doctor doctor = doctorDB.get(doctorId);
        return doctor;
    }


}
