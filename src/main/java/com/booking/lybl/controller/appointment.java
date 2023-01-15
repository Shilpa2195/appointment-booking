package com.booking.lybl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class appointment {

    @PostMapping("/appointment/book")
    public void bookAppointment(){
    }

    @GetMapping("/appointment/{id}")
    public void getAppointment(@PathVariable(name="id") String appointmentId){
    }

}
