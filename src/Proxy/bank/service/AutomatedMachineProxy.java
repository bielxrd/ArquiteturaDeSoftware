package Proxy.bank.service;

public class AutomatedMachineProxy implements IOperationsBank {

    private IOperationsBank bank;

    public AutomatedMachineProxy(IOperationsBank bank) {
        this.bank = bank;
    }

    @Override
    public void deposit(Long account, Long amount) {
        System.out.println("ATM proxy sending request to bank");
        if (bank == null) {
            bank = new Bank();
        }

        bank.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String password, Long amount) {
        if (amount > 300) {
            System.out.println("You can't withdraw more than 300");
            return;
        }
        System.out.println("ATM proxy sending request to bank");
        bank.withdraw(account, password, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("You must go to the bank to perform this operation");
        return;
    }
}
