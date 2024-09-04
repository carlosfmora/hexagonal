package com.example.packageorganization.approach1.adapter.out;

import com.example.packageorganization.approach1.application.port.out.CountAllUserPort;
import com.example.packageorganization.approach1.application.port.out.CreateUserPort;
import com.example.packageorganization.approach1.domain.User;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class UserPersistenceAdapter implements CountAllUserPort, CreateUserPort {

    private final Map<UUID, User> integerUserMap = new LinkedHashMap<>();

    @Override
    public int countAllUsers() {
        return this.integerUserMap.size();
    }

    @Override
    public User createUser(User user) {
        this.integerUserMap.put(user.getUuid(), user);
        return user;
    }
}
