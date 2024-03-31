package Strategy.AulaRocket.calculator.before;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,2);
        System.out.println(calculator.getResult("+"));
        System.out.println(calculator.getResult("-"));
        System.out.println(calculator.getResult("*"));
        System.out.println(calculator.getResult("/"));


    }
}
