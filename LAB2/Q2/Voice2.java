
public class Voice2 extends Voice {
   
    public final void templateMethod() {
        prepareVoice();  
        hear();    
    }
    
    public static void main(String[] args) {
        Voice2 obj = new Voice2();
        obj.templateMethod(); 
    }
}
