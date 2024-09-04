package com.example.packagestructure.approach1.application.service;

import com.example.packagestructure.approach1.application.port.in.CountAllUserQuery;
import com.example.packagestructure.approach1.application.port.out.CountAllUserPort;
import org.springframework.stereotype.Service;

@Service
public class CountAllUsersService implements CountAllUserQuery {
    private final CountAllUserPort countAllUserPort;

    public CountAllUsersService(CountAllUserPort countAllUserPort) {
        this.countAllUserPort = countAllUserPort;
    }

    @Override
    public int execute() {
        return this.countAllUserPort.countAllUsers();
    }
}
