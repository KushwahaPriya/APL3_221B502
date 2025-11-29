
class Animal {
    public void makeVoice() {
        System.out.println("Some generic animal sound");
    }
}

class Cow extends Animal {
 
    public void makeVoice() {
        System.out.println("Cow says: Moo");
    }
}

class Dog extends Animal {
    
    public void makeVoice() {
        System.out.println("Dog says: Woof");
    }
}

class Pig extends Animal {
  public void makeVoice() {
        System.out.println("Pig says: Oink");
    }
}

class Goat extends Animal {
  
    public void makeVoice() {
        System.out.println("Goat says: Baa");
    }
}

class Lion extends Animal {

    public void makeVoice() {
        System.out.println("Lion says: Roar");
    }
}


class Voice2 {
    private Animal[] animals;

    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    
    private void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    private void hear() {
        if (animals == null) {
            System.out.println("Animals have not been prepared. Call prepareVoice() first.");
            return;
        }
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

public class Test {
    public static void main(String[] args) {
       
        Voice2 voice = new Voice2();
        voice.templateMethod();
    }
}
