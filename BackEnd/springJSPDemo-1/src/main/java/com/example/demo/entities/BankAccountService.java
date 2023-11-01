package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.BankAccountRepository;

@Service
public class BankAccountService {
    private final BankAccountRepository accountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public double deposit(double amount) {
        BankAccount account = getOrCreateAccount();
        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
        accountRepository.save(account);
        return newBalance;
    }

    public double withdraw(double amount) {
        BankAccount account = getOrCreateAccount();
        if (account.getBalance() >= amount) {
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
            accountRepository.save(account);
            return newBalance;
        }
        return -1; // Insufficient funds
    }

    public double getBalance() {
        BankAccount account = getOrCreateAccount();
        return account.getBalance();
    }

    private BankAccount getOrCreateAccount() {
        BankAccount account = accountRepository.findById(1L).orElse(null);
        if (account == null) {
            account = new BankAccount();
            account.setId(1L);
            account.setBalance(0.0);
            accountRepository.save(account);
        }
        return account;
    }
}
