package Strategy.AulaRocket.employee.roles;

import Strategy.AulaRocket.employee.strategies.eat.MeatFoodStrategy;
import Strategy.AulaRocket.employee.strategies.transportation.AirPlaneStrategy;
import Strategy.AulaRocket.employee.strategies.work.PilotStrategy;

public class Pilot implements Employee {
    /**
     *
     */
    @Override
    public void eat() {
        new MeatFoodStrategy().eat();
    }

    /**
     *
     */
    @Override
    public void move() {
        new AirPlaneStrategy().move();
    }

    /**
     *
     */
    @Override
    public void work() {
        new PilotStrategy().work();
    }
}
