class RubberDuck extends Duck {
    private Flyable flyBehavior = new NoFly();
    private Quackable quackBehavior = new Squeak();

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }
}