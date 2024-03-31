package Strategy.AulaRocket.person;

import Strategy.AulaRocket.person.strategies.eat.EatStrategy;
import Strategy.AulaRocket.person.strategies.transportation.TransportationStrategy;
import Strategy.AulaRocket.person.strategies.work.WorkStrategy;

public class Person {

    private EatStrategy eatStrategy;
    private TransportationStrategy transportationStrategy;
    private WorkStrategy workStrategy;
    private String name;

    public Person(EatStrategy eatStrategy, TransportationStrategy transportationStrategy, WorkStrategy workStrategy, String name) {
        this.eatStrategy = eatStrategy;
        this.transportationStrategy = transportationStrategy;
        this.workStrategy = workStrategy;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        eatStrategy.eat();
    }

    public void move() {
        transportationStrategy.move();
    }

    public void work() {
        workStrategy.work();
    }
}
