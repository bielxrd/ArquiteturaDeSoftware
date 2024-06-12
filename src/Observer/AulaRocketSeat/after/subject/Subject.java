package Observer.AulaRocketSeat.after.subject;

import Observer.AulaRocketSeat.after.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(boolean status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
