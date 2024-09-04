package com.example.packagestructure.approach1.application.service;

import com.example.packagestructure.approach1.application.CreateUserCommand;
import com.example.packagestructure.approach1.application.port.in.CreateUserUseCase;
import com.example.packagestructure.approach1.application.port.out.CreateUserPort;
import com.example.packagestructure.approach1.domain.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateUserService implements CreateUserUseCase {
    private CreateUserPort createUserPort;

    public CreateUserService(CreateUserPort createUserPort) {
        this.createUserPort = createUserPort;
    }

    @Override
    public UUID execute(CreateUserCommand command) {
        validateBusinessRules(command);
        User createdUser = manipulateModel(command);
        UUID userId = mapData(createdUser);
        return userId;

    }

    private UUID mapData(User createdUser) {
        return createdUser.getUuid();
    }

    private User manipulateModel(CreateUserCommand command) {
        User newUser = User.newInstance(command.getDocumentNumber());
        return createUserPort.createUser(newUser);
    }

    private void validateBusinessRules(CreateUserCommand command) {
        requireUniqueDocument(command.getDocumentNumber());
    }

    private void requireUniqueDocument(int documentNumber) {
        // TODO:
    }
}
