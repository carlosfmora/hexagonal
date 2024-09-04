package com.example.jakartavalidations.application.port.in.validateinputusecase.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class IntegerListValidator implements ConstraintValidator<ValidIntegerList, List<Integer>> {
    @Override
    public boolean isValid(List<Integer> integers, ConstraintValidatorContext constraintValidatorContext) {
        if (integers == null) {
            return true;
        }
        boolean isValid = true;

        // Iterate over each element and validate
        for (int i = 0; i < integers.size(); i++) {
            if (!isValidInteger(integers.get(i))) {
                isValid = false;
                // Adding a specific error message for each invalid element
                constraintValidatorContext.disableDefaultConstraintViolation();
                constraintValidatorContext.buildConstraintViolationWithTemplate("Invalid value: " + integers.get(i))
                    .addPropertyNode(String.valueOf(i))
                    .addConstraintViolation();
            }
        }

        return isValid;
    }

    private boolean isValidInteger(int value) {
        // Custom validation logic
        return value >= 0; // Example condition: value must be non-negative
    }
}
