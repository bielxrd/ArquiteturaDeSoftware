package Strategy.AulaRocket.calculator.after.strategies;

public class DivisionOperation implements OperationsStrategy {

    @Override
    public int calculate(int n1, int n2) {
       return n1 / n2;
    }
}
