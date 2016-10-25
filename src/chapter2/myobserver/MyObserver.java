package chapter2.myobserver;

public class MyObserver implements Observer {

    @Override
    public void update(Subject subject, Object obj) {
        if (obj != null) {
            System.out.println(obj);
        } else {
            System.out.println(subject.getClass());
        }
    }
}
