class 	Vodka extends Decortor{
Vodka(Offering offering){
this.offering = offering;
}
string getName(){
return offering.getName()+"with Vodka";
}
int getPrice(){
return offering.getprice()+65;
}
}