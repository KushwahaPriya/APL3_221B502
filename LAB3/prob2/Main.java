interface Testable {
    void display();  // Implicitly public and abstract
}

class Test implements Testable {
    public void display() { // Must be public
        System.out.println("Display method in Test class");
    }
}
abstract class AbsTest implements Testable {
    
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display(); 
    }
}
