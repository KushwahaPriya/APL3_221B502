abstract class Beverage {
    private void pour(int qty){
        System.out.println("Pour "+qty+" of Whisky in a glass");
    }
    protected abstract void addCondiment();

    protected void stir(){ } //hook (according to need access it!)
    
    private void serve(){
        System.out.println("Serve through the waiter");
    }

    // Template Methods

    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}
