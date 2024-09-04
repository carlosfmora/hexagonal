package com.example.packageorganization.approach1.application;

public class CreateUserCommand {
    private final int documentNumber;

    public CreateUserCommand(int documentNumber) {
        this.documentNumber = documentNumber;
        requireGraterThan(documentNumber, 0);
        requireGraterThan(documentNumber, 10);
    }

    private void requireGraterThan(int value, int compareWith) {
        if (value < compareWith) {
            throw new IllegalArgumentException("document should be grater than " + compareWith);
        }
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

}
