package com.spring.demo.springmvcjspdemo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CustomValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MustStartWith {

    String[] value() default "LUV";

    String message() default "must start with LUV";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
