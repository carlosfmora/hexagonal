package com.example.jakartavalidations.domain;

import com.example.jakartavalidations.application.port.in.validateinputusecase.validators.ValidObjectCorrelation;
import com.example.jakartavalidations.application.port.in.validateinputusecase.validators.ValidOperation;
import jakarta.validation.constraints.NotNull;

@ValidObjectCorrelation
public class AggregatedObject {
    @NotNull
    @ValidOperation
    private Operation op;
    //    @NotNull
    private String path;
    private Object value;


    public AggregatedObject(String op, String path, Object value) {
        this.op = Operation.from(op);
        this.path = path;
        this.value = value;
    }

    public boolean isValid() {
        return "add".equalsIgnoreCase(this.op.toString());
    }

    public boolean pathIsKeyword() {
        return "keywords".equalsIgnoreCase(this.path);
    }

    @Override
    public String toString() {
        return "InternalObject{" +
            "op='" + op + '\'' +
            ", path='" + path + '\'' +
            ", value=" + value +
            '}';
    }

    public Operation getOp() {
        return op;
    }

    public String getPath() {
        return this.path;
    }
}
