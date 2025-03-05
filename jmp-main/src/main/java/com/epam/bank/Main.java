package com.epam.bank;

import com.epam.dto.User;

public class Main {
    
    public static void main(String[] args) {
        User user = new User();
        user.setName("John Doe");
        System.out.println("Hello, " + user.getName());
    }
}
