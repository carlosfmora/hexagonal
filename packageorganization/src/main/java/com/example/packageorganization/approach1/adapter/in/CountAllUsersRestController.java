package com.example.packageorganization.approach1.adapter.in;


import com.example.packageorganization.approach1.application.port.in.CountAllUserQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountAllUsersRestController {

    private CountAllUserQuery countAllUserQuery;

    public CountAllUsersRestController(CountAllUserQuery countAllUserQuery) {
        this.countAllUserQuery = countAllUserQuery;
    }

    @GetMapping("/users/count")
    public int countAllUsers() {
        return this.countAllUserQuery.execute();
    }
}
