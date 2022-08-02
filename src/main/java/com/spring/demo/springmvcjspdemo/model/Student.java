package com.spring.demo.springmvcjspdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedHashMap;

@AllArgsConstructor
@Data
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;

    private String favouriteLanguage;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
    }
}
