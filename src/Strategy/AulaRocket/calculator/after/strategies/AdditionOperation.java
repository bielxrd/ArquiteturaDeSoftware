package Strategy.AulaRocket.calculator.after.strategies;

public class AdditionOperation implements OperationsStrategy {

    @Override
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}
