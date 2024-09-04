package com.example.packagestructure.approach1.domain;

import java.util.UUID;

public class User {
    private final UUID uuid;
    private final int documentNumber;
    private final int totalTask;
    private final int completedTask;

    private User(UUID uuid, int documentNumber, int totalTask, int completedTask) {
        this.uuid = uuid;
        this.documentNumber = documentNumber;
        this.totalTask = totalTask;
        this.completedTask = completedTask;
    }

    public static User newInstance(int documentNumber) {
        return new User(UUID.randomUUID(), documentNumber, 0, 0);
    }

    public UUID getUuid() {
        return uuid;
    }
}
