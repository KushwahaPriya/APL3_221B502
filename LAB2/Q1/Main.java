
public class Voice {
    Animal[] animals = new Animal[5];  

  
    public void prepareVoice() {
        animals[0] = new Cow();  
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }


    public void hear() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeVoice();  
        }
    }
}

