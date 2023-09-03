class j{
  public static void main(String[] args){
    String[] subject={"math","science","history","english"};
    for(int i=0; i<4; i++){
      System.out.println(subject[i]);
      if(subject[i]=="math"){
        System.out.println("your marks are 90");
        }
      if(subject[i]=="science"){
        System.out.println("your mark are 60");
        }
      if(subject[i]=="history"){
        System.out.println("your marks are 94");
        }
      if(subject[i]=="english"){
        System.out.println("your marks are70");
        }
      
    }
    int len=subject.length;
    System.out.println("the length is"+len);
  }
}