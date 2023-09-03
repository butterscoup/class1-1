class Info{
  public void test(){
   System.out.println("hello"); 
  }
  public void test(int x){
    System.out.println("your marks are "+x);
  }
  public void test(int y, double z){
    System.out.println("your math test is "+y);
    System.out.println("your history test is "+z);
  }
  public void test(double n, int m){
    System.out.println("your english test is "+n);
    System.out.println("your science test is "+m);
  }
}
class xfvnxjnv{
  public static void main(String[] args){
    Info i= new Info();
    i.test();
    i.test(90);
    i.test(70,80.67);
    i.test(97.5,89);
  }
}