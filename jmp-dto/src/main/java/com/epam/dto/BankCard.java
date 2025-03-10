package com.epam.dto;

public class BankCard {

    private String number;
    private User user;

    public BankCard(String number, User user) {
        this.number = number;
        this.user = user;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
