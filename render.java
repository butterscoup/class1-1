class Shape{
  public void render(){
    System.out.println("the following is information about each shape");
  }
}
class Square extends Shape{
  public void render(int x){
    System.out.println("the length of the square is "+x);
  }
}
class Circle extends Square{
  public void render(double y){
    System.out.println("the radius of the circle is "+y);
  }
}
class dffgdfg{
  public static void main(String[] args){
    Circle c = new Circle();
    c.render(7.6);
    c.render(5);
  }
}