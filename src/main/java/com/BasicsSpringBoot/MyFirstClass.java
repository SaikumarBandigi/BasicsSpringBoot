package com.BasicsSpringBoot;


import org.springframework.stereotype.Component;


// Constructor Injection
// Field Injection (@Autowired is Mandatory)
// Setter Injection (@Autowired is Mandatory)

public class MyFirstClass {


    private String myVar;


    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }


    public String sayHello() {
        return "SAI " + myVar;
    }




}