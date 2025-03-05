package com.epam.service.impl;

import com.epam.service.api.BankService;
import com.epam.dto.BankCard;
import com.epam.dto.Subscription;
import com.epam.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankServiceImpl implements BankService {

    private List<Subscription> subscriptions = new ArrayList<>();

    public void subscribe(BankCard bankCard) {
        Subscription subscription = new Subscription(bankCard.getNumber(), bankCard.getUser());
        subscriptions.add(subscription);
    }

    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getBankcardNumber().equals(cardNumber)) {
                return Optional.of(subscription);
            }
        }
        return Optional.empty();
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (Subscription subscription : subscriptions) {
            users.add(subscription.getUser());
        }
        return users;
    }

}
