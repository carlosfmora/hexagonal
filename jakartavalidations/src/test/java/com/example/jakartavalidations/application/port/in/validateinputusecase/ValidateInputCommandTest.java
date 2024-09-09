package com.example.jakartavalidations.application.port.in.validateinputusecase;

import com.example.jakartavalidations.domain.aggregatedobject.AggregatedObject;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputCommandTest{

    @Test
    void createInstance(){
        try {
            List<Integer> values = new ArrayList<>();
            values.add(50);
            values.add(-50);
            values.add(20);
            List<AggregatedObject> valuesObj = new ArrayList<>();
            valuesObj.add(new AggregatedObject(null, null, null));
            valuesObj.add(new AggregatedObject("remove", null, null));
            valuesObj.add(new AggregatedObject("add", null, null));
            ValidateInputCommand validateInputCommand = new ValidateInputCommand(
                -50
                , values
                , valuesObj);
            fail("no se debia crear");
        } catch (ConstraintViolationException exception) {
            for (ConstraintViolation<?> violation : exception.getConstraintViolations()) {
                System.out.println("---");
                System.out.println("Atributo: /" + violation.getPropertyPath().toString().replaceAll("\\.", "/"));
//                System.out.println("Valor: " + violation.getInvalidValue());
                System.out.println("Mensaje: " + violation.getMessage());
            }
        }
    }

}
