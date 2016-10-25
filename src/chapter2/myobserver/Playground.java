package chapter2.myobserver;

import java.util.Date;

public class Playground {
    public static void main(String[] args) {
        MySubject subject = new MySubject();
        MyObserver observer = new MyObserver();
        subject.setChanged();
        subject.notifyObservers();

        subject.registerObserver(observer);
        subject.setChanged();
        subject.notifyObservers();

        subject.setChanged();
        subject.notifyObservers(new Date());
    }
}
