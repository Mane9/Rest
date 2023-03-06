package com.example.Rest.controller;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Entity

@RestController
public class Apicontrollers {

    @GetMapping( value = "/")
    public String getPage()
    {
       return " Welcome";
    }
}
