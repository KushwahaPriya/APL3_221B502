public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
            new RubberDuck(),
            new WoodenDuck(),
            new RedHeadDuck(),
            new LakeDuck()
        };

        for (Duck d : ducks) {
            System.out.println("\n" + d.getClass().getSimpleName() + ":");
            d.swim();

            if (d instanceof RubberDuck) {
                ((RubberDuck) d).performFly();
                ((RubberDuck) d).performQuack();
            } else if (d instanceof WoodenDuck) {
                ((WoodenDuck) d).performFly();
                ((WoodenDuck) d).performQuack();
            } else if (d instanceof RedHeadDuck) {
                ((RedHeadDuck) d).performFly();
                ((RedHeadDuck) d).performQuack();
            } else if (d instanceof LakeDuck) {
                ((LakeDuck) d).performFly();
                ((LakeDuck) d).performQuack();
            }
        }
    }
}
