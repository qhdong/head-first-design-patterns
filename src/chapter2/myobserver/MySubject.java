package chapter2.myobserver;

import java.util.ArrayList;

public class MySubject implements Subject {
    private boolean changed = false;
    private ArrayList<Observer> observers;

    public MySubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    @Override
    public void clearChanged() {
        changed = false;
    }

    @Override
    public boolean hasChanged() {
        return changed;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (hasChanged()) {
            for (Observer observer : observers) {
                observer.update(this, null);
            }
        }
        clearChanged();
    }

    @Override
    public void notifyObservers(Object arg) {
        if (hasChanged()) {
            for (Observer observer : observers) {
                observer.update(this, arg);
            }
        }
        clearChanged();
    }
}
