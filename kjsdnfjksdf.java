class First{
  public void perform(int x, int y){
    System.out.println("the sum is"+(x+y));
    
  }
  public void perform(double n, int z){
    System.out.println("the difference is "+(n-z));
  }
}
class Multiply{
  public void action(int r, int d){
    System.out.println("the product is "+(r*d));
  }
}
class Division extends Multiply{
  public void action(double o, int p){
    System.out.println("the quotient is "+(o/p));
  }
}
class sdfkjnsdfkjn{
  public static void main(String[] args){
    First b = new First();
    b.perform(6,7);
    b.perform(9.6,10);
    Division l= new Division();
    l.action(2,3);
    l.action(4,5);
    
  }
}