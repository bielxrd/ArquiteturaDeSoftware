package Strategy.AulaRocket.employee;

import Strategy.AulaRocket.employee.roles.Developer;
import Strategy.AulaRocket.employee.roles.Employee;
import Strategy.AulaRocket.employee.roles.HipsterDeveloper;
import Strategy.AulaRocket.employee.roles.Pilot;

public class Client {

    public static void presentYourself(Employee worker, String name) {
        System.out.println("Hi. I'm "+name);
        worker.eat();
        worker.move();
        worker.work();
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Employee ana = new Developer();
        presentYourself(ana, "Ana");

        Employee julie = new HipsterDeveloper();
        presentYourself(julie, "Julie");

        Employee gabriel = new Pilot();
        presentYourself(gabriel, "Gabriel");
    }
}
