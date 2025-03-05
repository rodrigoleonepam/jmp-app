package com.epam.bank.api;

import com.epam.dto.User;
import com.epam.dto.BankCard;
import com.epam.dto.BankCardType;

public interface Bank {

    public BankCard createBankCard(String number, User user, BankCardType cardType);
    
}
