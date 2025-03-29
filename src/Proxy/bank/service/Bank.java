package Proxy.bank.service;

import Proxy.bank.model.User;

import java.util.HashMap;
import java.util.Map;

public class Bank implements IOperationsBank {
    private Map<Long, User> userDatabase;

    public Bank() {
        userDatabase = new HashMap<Long, User>();
        userDatabase.put(123L, new User("User #1", 123L, "1234", 1000L));
        userDatabase.put(456L, new User("User #2", 456L, "9999", 200L));
    }

    @Override
    public void deposit(Long account, Long amount) {
        User user = userDatabase.get(account);
        if (user == null) {
            System.out.println("Invalid account");
            return;
        }

        user.setBalance(user.getBalance() + amount);
        System.out.println(String.format("Deposited %d to account #%d", amount, account));
    }

    @Override
    public void withdraw(Long account, String password, Long amount) {
        User user = userDatabase.get(account);
        if (user == null) {
            System.out.println("Invalid account");
            return;
        }

        if (!user.getPassword().equals(password)) {
            System.out.println("Invalid password");
            return;
        }

        if (user.getBalance() < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        user.setBalance(user.getBalance() - amount);
        System.out.println(String.format("Withdrawn %d to account #%d", amount, account));
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        User user = userDatabase.get(account);
        if (user == null) {
            System.out.println("Invalid account");
            return;
        }
        if (!user.getPassword().equals(oldPassword)) {
            System.out.println("Invalid old password");
            return;
        }

        user.setPassword(newPassword);
        System.out.println(String.format("Changed password for account #%d", account));
    }
}
