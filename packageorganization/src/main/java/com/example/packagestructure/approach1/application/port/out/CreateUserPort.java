package com.example.packagestructure.approach1.application.port.out;


import com.example.packagestructure.approach1.domain.User;

public interface CreateUserPort {
    User createUser(User user);
}
