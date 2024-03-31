package Strategy.AulaRocket.person;

import Strategy.AulaRocket.employee.roles.Employee;
import Strategy.AulaRocket.employee.roles.HipsterDeveloper;
import Strategy.AulaRocket.person.strategies.eat.MeatFoodStrategy;
import Strategy.AulaRocket.person.strategies.eat.VeggieFoodStrategy;
import Strategy.AulaRocket.person.strategies.transportation.AirPlaneStrategy;
import Strategy.AulaRocket.person.strategies.transportation.BikeStrategy;
import Strategy.AulaRocket.person.strategies.transportation.CarStrategy;
import Strategy.AulaRocket.person.strategies.work.DeveloperStrategy;
import Strategy.AulaRocket.person.strategies.work.PilotStrategy;

public class Client {

    public static void presentYourself(Person person) {
        System.out.println("Hi. I'm "+person.getName());
        person.eat();
        person.move();
        person.work();
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Person jhon = new Person(new MeatFoodStrategy(),new AirPlaneStrategy(), new DeveloperStrategy(), "Jhon");

        Person rafael = new Person(new VeggieFoodStrategy(),new CarStrategy(), new DeveloperStrategy(), "Rafael");

        Person gabriel = new Person(new MeatFoodStrategy(),new BikeStrategy(), new PilotStrategy(), "Gabriel");

        presentYourself(jhon);
        presentYourself(rafael);
        presentYourself(gabriel);

    }
}
