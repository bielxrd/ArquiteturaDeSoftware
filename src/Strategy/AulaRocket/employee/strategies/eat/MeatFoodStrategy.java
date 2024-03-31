package Strategy.AulaRocket.employee.strategies.eat;

public class MeatFoodStrategy implements EatStrategy {

    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }
}
