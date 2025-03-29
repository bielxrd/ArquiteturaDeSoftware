package Proxy.bank;

import Proxy.bank.service.AutomatedMachineProxy;
import Proxy.bank.service.Bank;
import Proxy.bank.service.IOperationsBank;

public class Client {
    public static void main(String[] args) {
        IOperationsBank bank = new Bank();
        bank.deposit(123L, 500L);
        bank.withdraw(456L, "8888", 50L);
        bank.withdraw(456L, "9999", 50L);
        bank.withdraw(123L, "1234", 2000L);
        bank.changePassword(123L, "1111", "4321");
        bank.changePassword(123L, "1234", "4321");
        bank.withdraw(123L, "4321", 700L);

        System.out.println("------------- Automated Machine -------------");
        IOperationsBank atm = new AutomatedMachineProxy(bank);
        atm.deposit(123L, 500L);
        atm.withdraw(456L, "8888", 50L);
        atm.withdraw(456L, "9999", 50L);
        atm.withdraw(123L, "1234", 2000L);
        atm.changePassword(123L, "1111", "4321");
        atm.changePassword(123L, "1234", "4321");
        atm.withdraw(123L, "4321", 700L);
    }
}
