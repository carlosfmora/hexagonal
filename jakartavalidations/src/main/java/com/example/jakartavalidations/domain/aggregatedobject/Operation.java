package com.example.jakartavalidations.domain;

public class Operation {
    private final String operation;

    private Operation(String operation) {
        this.operation = operation;
    }

    public static Operation from(String operation) {
        return new Operation(operation);
    }

    @Override
    public String toString() {
        return operation;
    }
}
