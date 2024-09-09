package com.example.jakartavalidations.domain.aggregatedobject;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class OperationValidator implements ConstraintValidator<ValidOperation, Operation> {
    @Override
    public boolean isValid(Operation operation, ConstraintValidatorContext constraintValidatorContext) {
        if (operation == null) {
            return true;
        }
        return "add".equalsIgnoreCase(operation.toString());
    }
}
