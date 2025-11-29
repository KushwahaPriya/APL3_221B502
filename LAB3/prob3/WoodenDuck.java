class WoodenDuck extends Duck {
    private Flyable flyBehavior = new NoFly();
    private Quackable quackBehavior = new Mute();

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }
}