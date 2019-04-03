package com.isa.user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class AdminUserTest {

    private Set<String> adminUsers = null;

    @BeforeEach
    public void init() {
        adminUsers = new HashSet<>();
        adminUsers.add("adam");
        adminUsers.add("anna");
    }

    @AfterEach
    public void clean() {
        adminUsers = null;
    }

    @Test
    public void testIfUserIsInAdmin() {

        User user1 = new User("adam");

        // TASK
    }
}
