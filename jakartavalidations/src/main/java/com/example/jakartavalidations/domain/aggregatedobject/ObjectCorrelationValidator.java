package com.example.jakartavalidations.domain.aggregatedobject;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ObjectCorrelationValidator implements ConstraintValidator<ValidObjectCorrelation, AggregatedObject> {
    @Override
    public boolean isValid(AggregatedObject aggregatedObject, ConstraintValidatorContext constraintValidatorContext) {
        if (aggregatedObject == null) {
            return true;
        }
        boolean isValid = true;

        if (!isValid(aggregatedObject)) {
            isValid = false;
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Invalid correlation: " + aggregatedObject
                .getOp() + " - " + aggregatedObject.getPath()
            )
                .addConstraintViolation();
        }

        return isValid;
    }

    private boolean isValid(AggregatedObject aggregatedObject) {
        return aggregatedObject.isValid() && aggregatedObject.pathIsKeyword();
    }
}
