package Strategy.AulaRocket.calculator.after;

import Strategy.AulaRocket.calculator.after.strategies.OperationsStrategy;

public class Calculator {

    private int n1;
    private int n2;

    public Calculator() {
    }

    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getResult(OperationsStrategy strategy) {
        return strategy.calculate(n1, n2);
    }

}
