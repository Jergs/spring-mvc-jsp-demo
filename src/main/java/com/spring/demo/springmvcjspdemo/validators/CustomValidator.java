package com.spring.demo.springmvcjspdemo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.nonNull;

public class CustomValidator implements ConstraintValidator<MustStartWith, String> {

    private String[] values;

    @Override
    public void initialize(MustStartWith constraintAnnotation) {
        this.values = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;

        if (nonNull(s)) {
            for(String value: values){
                result = s.startsWith(value);

                if(result)
                    break;
            }

        } else {
            result = true;
        }

        return result;
    }
}
