package chapter2.myobserver;

public interface Subject {
    void setChanged();
    void clearChanged();
    boolean hasChanged();
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void notifyObservers(Object arg);
}
