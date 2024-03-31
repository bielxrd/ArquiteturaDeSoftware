package Strategy.AulaRocket.person.strategies.transportation;

public class CarStrategy implements TransportationStrategy {
    /**
     *
     */
    @Override
    public void move() {
        System.out.println("I use a car to go anywhere!");
    }
}
