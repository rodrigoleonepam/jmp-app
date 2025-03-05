package com.epam.service.api;

import com.epam.dto.User;
import com.epam.dto.BankCard;
import com.epam.dto.BankCardType;
import com.epam.dto.Subscription;

import java.util.List;
import java.util.Optional;

public interface BankService {

    public void subscribe(BankCard bankCard);

    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    public List<User> getAllUsers();

}
