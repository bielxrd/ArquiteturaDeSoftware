package Strategy.AulaRocket.calculator.before;

public class Calculator {

    private int n1;
    private int n2;

    public Calculator() {
    }

    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getResult(String operation) {
        return switch (operation) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> 0;
        };

    }
}
