package de.seuhd.observer;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    // TODO: Add fields.
    private final List<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
        // TODO: Implement attach method.
        observers.add(observer);
    }

    void detach(Observer observer) {
        // TODO: Implement detach method.
        observers.remove(observer);
    }

    protected void notifyObservers() {
        // TODO: Implement fireUpdate method.
        System.out.println("Sending update to observers ...");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
