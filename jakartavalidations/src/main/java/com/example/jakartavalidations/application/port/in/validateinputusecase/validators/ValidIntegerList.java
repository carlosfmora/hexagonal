package com.example.jakartavalidations.application.port.in.validateinputusecase.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IntegerListValidator.class)
public @interface ValidIntegerList {
    String message() default "Invalid integer value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
