package chapter1.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
    }
}
