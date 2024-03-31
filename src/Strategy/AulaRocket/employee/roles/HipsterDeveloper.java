package Strategy.AulaRocket.employee.roles;

import Strategy.AulaRocket.employee.strategies.eat.VeggieFoodStrategy;
import Strategy.AulaRocket.employee.strategies.transportation.BikeStrategy;
import Strategy.AulaRocket.employee.strategies.work.DeveloperStrategy;

public class HipsterDeveloper implements Employee {
    /**
     *
     */
    @Override
    public void eat() {
        new VeggieFoodStrategy().eat();
    }

    /**
     *
     */
    @Override
    public void move() {
        new BikeStrategy().move();
    }

    /**
     *
     */
    @Override
    public void work() {
        new DeveloperStrategy().work();
    }
}
