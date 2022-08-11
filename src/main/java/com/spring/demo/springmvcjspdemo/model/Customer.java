package com.spring.demo.springmvcjspdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Customer {

    private String firstName;
    @NotEmpty(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
    @Min(value=0, message = "must be greater than 0")
    @Max(value=10, message = "must be lower than 10")
    private Integer freePasses;
}
