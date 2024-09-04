package com.example.jakartavalidations.application.port.in.validateinputusecase.validators;

import com.example.jakartavalidations.domain.SimpleObjectVO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SimpleObjectVoValidator implements ConstraintValidator<ValidSimpleObjectVO, SimpleObjectVO> {

    @Override
    public boolean isValid(SimpleObjectVO simpleObjectVO, ConstraintValidatorContext constraintValidatorContext) {
        if (simpleObjectVO == null) {
            return true;
        }
        return simpleObjectVO.isPositive();
    }
}
