package com.epam.dto;

import java.time.LocalDate;

public class Subscription {

    private String bankcardNumber;
    private User user;
    private LocalDate startDate;

    public Subscription(String bankcardNumber, User user) {
        this.bankcardNumber = bankcardNumber;
        this.user = user;
        startDate = LocalDate.now();
    }

    public void setBankcardNumber(String bankcardNumber) {
        this.bankcardNumber = bankcardNumber;
    }

    public String getBankcardNumber() {
        return bankcardNumber;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
