class LakeDuck extends Duck {
    private Flyable flyBehavior = new CanFly();
    private Quackable quackBehavior = new Quack();

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }
}