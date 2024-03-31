package Strategy.AulaRocket.calculator.after.strategies;

public class MultiplicationOperation implements OperationsStrategy {

    @Override
    public int calculate(int n1, int n2) {
       return n1 * n2;
    }
}
