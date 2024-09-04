package com.example.packageorganization.approach1.adapter.in;

import com.example.packageorganization.approach1.application.CreateUserCommand;
import com.example.packageorganization.approach1.application.port.in.CreateUserUseCase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CreateUserRestController {

    private CreateUserUseCase createUserUseCase;

    public CreateUserRestController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PutMapping("/users/{documentNumber}")
    public UUID createUser(@PathVariable int documentNumber) {
        CreateUserCommand command = new CreateUserCommand(documentNumber);
        return this.createUserUseCase.execute(command);
    }
}
