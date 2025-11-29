abstract class Bharatvanshi {
    String name;

    public Bharatvanshi(String name) {
        this.name = name;
    }

    public void fight() {
        System.out.println(name + " is fighting!");
    }

    public abstract void obey();
    public abstract void kind();
}

abstract class Pandav extends Bharatvanshi {

    public Pandav(String name) {
        super(name);
    }

    @Override
    public void obey() {
        System.out.println(name + " obeys the rules!");
    }

    @Override
    public void kind() {
        System.out.println(name + " is kind!");
    }
}

abstract class Kaurav extends Bharatvanshi {

    public Kaurav(String name) {
        super(name);
    }

    @Override
    public void obey() {
        System.out.println(name + " disobeys the rules!");
    }

    @Override
    public void kind() {
        System.out.println(name + " is cruel!");
    }
}

class Arjun extends Pandav {
    public Arjun() {
        super("Arjun");
    }
}

class Bheem extends Pandav {
    public Bheem() {
        super("Bheem");
    }
}

class Duryodhan extends Kaurav {
    public Duryodhan() {
        super("Duryodhan");
    }
}

class Vikarn extends Kaurav {
    public Vikarn() {
        super("Vikarn");
    }

    @Override
    public void obey() {
        System.out.println(name + " obeys the rules (noble Kaurav)!");
    }

    @Override
    public void kind() {
        System.out.println(name + " is kind (noble Kaurav)!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();

        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
