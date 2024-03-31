package Strategy.AulaRocket.employee.strategies.transportation;

public class AirPlaneStrategy implements TransportationStrategy {


    @Override
    public void move() {
        System.out.println("I use airplane to go (almost) anywhere! ");
    }
}
