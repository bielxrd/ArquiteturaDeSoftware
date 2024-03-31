package Strategy.AulaRocket.employee.roles;

import Strategy.AulaRocket.employee.strategies.eat.MeatFoodStrategy;
import Strategy.AulaRocket.employee.strategies.transportation.CarStrategy;
import Strategy.AulaRocket.employee.strategies.work.DeveloperStrategy;

public class Developer  implements Employee {


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
        new CarStrategy().move();
    }

    /**
     *
     */
    @Override
    public void work() {
        new DeveloperStrategy().work();
    }
}
