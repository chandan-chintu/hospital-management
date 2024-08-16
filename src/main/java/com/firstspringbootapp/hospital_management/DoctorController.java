package com.firstspringbootapp.hospital_management;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    // database used here is hashmap
    HashMap<Integer,Doctor> doctorDB = new HashMap<>();


    // writing our first API
    // this API add doctors into hashmap database which we created above
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor){
        int doctorId = doctor.getDoctorId();
        doctorDB.put(doctorId, doctor);

        return "Doctor added successfully";
    }
}
