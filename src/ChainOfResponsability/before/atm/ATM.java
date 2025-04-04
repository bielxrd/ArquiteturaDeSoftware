package ChainOfResponsability.before.atm;

public class ATM {
    public void withdraw(double amount) {
        double remaining = amount;
        System.out.println("Calculating bills set for $" + amount);

        if (remaining >= 50) {
            int bills = (int) (remaining / 50);
            remaining %= 50;
            System.out.println("50s: " + bills);
        }

        if (remaining >= 10) {
            int bills = (int) (remaining / 10);
            remaining %= 10;
            System.out.println("10s: " + bills);
        }

        if (remaining >= 1) {
            int bills = (int) (remaining / 1);
            remaining %= 1;
            System.out.println("1s: " + bills);
        }
    }
}
