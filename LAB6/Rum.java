class Rum extends offering{
    rum(offering offering){
        this,offering = offering;
        
    }
    String get name(){
        return offering.et name()+"with Rum";
    }
    int get price(){
        return offering.get price ()+55;
    }
}