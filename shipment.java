class Box{
  public void information(){
    System.out.println("this is a box");
  }
}
class BoxWeight extends Box{
  public void information(int x){
    System.out.println("the weight of the box is "+x);
  }
}
class Shipment extends BoxWeight{
  public void information(double y){
    System.out.println("the cost of the equipment is "+y);
  }
}
class sfjskf{
  public static void main(String[] args){
    Shipment n= new Shipment();
    n.information();
    n.information(70);
    n.information(105.99);
  }
}