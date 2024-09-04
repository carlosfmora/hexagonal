package com.example.packageorganization.approach1.application.port.out;


import com.example.packageorganization.approach1.domain.User;

public interface CreateUserPort {
    User createUser(User user);
}
