package com.example.packagestructure.approach1.application.port.in;


import com.example.packagestructure.approach1.application.CreateUserCommand;

import java.util.UUID;

public interface CreateUserUseCase {
    UUID execute(CreateUserCommand command);
}
