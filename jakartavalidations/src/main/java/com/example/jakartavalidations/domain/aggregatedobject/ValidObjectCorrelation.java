package com.example.jakartavalidations.application.port.in.validateinputusecase.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ObjectCorrelationValidator.class)
public @interface ValidObjectCorrelation {
    String message() default "Invalid Internal object by default";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
