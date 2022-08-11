package com.spring.demo.springmvcjspdemo.model;

import com.spring.demo.springmvcjspdemo.validators.MustStartWith;
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

    @NotNull(message = "is required")
    @Min(value=0, message = "must be greater than 0")
    @Max(value=10, message = "must be lower than 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars are allowed")
    private String postalCode;

    @MustStartWith(value = "TOP", message = "must start with TOP")
    private String course;
}
