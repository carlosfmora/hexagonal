package com.example.jakartavalidations.application.port.in.validateinputusecase.validators;

import com.example.jakartavalidations.domain.Operation;
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
