package ChainOfResponsability.after.atm;

public class Client {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdraw(230);
        System.out.println("Withdrawing 230...");
        atm.withdraw(1589);
        System.out.println("Withdrawing 1589...");
    }
}
