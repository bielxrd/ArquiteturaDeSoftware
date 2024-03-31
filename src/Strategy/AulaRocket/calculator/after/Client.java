package Strategy.AulaRocket.calculator.after;

import Strategy.AulaRocket.calculator.after.strategies.AdditionOperation;
import Strategy.AulaRocket.calculator.after.strategies.DivisionOperation;
import Strategy.AulaRocket.calculator.after.strategies.MultiplicationOperation;
import Strategy.AulaRocket.calculator.after.strategies.SubtractionOperation;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 2);
        System.out.println(calculator.getResult(new AdditionOperation()));
        System.out.println(calculator.getResult(new SubtractionOperation()));
        System.out.println(calculator.getResult(new MultiplicationOperation()));
        System.out.println(calculator.getResult(new DivisionOperation()));
    }

}
