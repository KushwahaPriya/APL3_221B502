public class Singleton{
    private static Singleton uniqueInstance;
    static int count = 0;
    private Singleton(){
        count++;
    }
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    public static void count(){
        System.out.println(count);
    }
}