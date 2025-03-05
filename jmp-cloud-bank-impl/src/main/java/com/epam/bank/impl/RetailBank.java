package com.epam.bank.impl;

import com.epam.bank.api.Bank;
import com.epam.dto.User;
import com.epam.dto.BankCard;
import com.epam.dto.BankCardType;
import com.epam.dto.CreditCardBank;
import com.epam.dto.DebitCardBank;

public class RetailBank implements Bank {

    public BankCard createBankCard(String number, User user, BankCardType type) {
        if (type.equals(BankCardType.CREDIT)) {
            return new CreditCardBank(number, user);
        } else {
            return new DebitCardBank(number, user);
        }
    }
    
}
