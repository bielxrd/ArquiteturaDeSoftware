package Proxy.bank.service;

public interface IOperationsBank {
    void deposit(Long account, Long amount);
    void withdraw(Long account, String password, Long amount);
    void changePassword(Long account, String oldPassword, String newPassword);
}
