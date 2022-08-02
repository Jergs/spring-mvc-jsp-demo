package com.spring.demo.springmvcjspdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Customer {

    private String firstName;
    @NotEmpty(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
}
