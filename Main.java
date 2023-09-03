import java.util.Scanner;
class Main{
  public static void main(String[] args){
   int ar[]= new int[5];
    Scanner ob=new Scanner(System.in);
    for(int a=0; a<ar.length; a++){
      System.out.println("enter your marks");
      ar[a]=ob.nextInt();
    }
    int max=0;
    for(int i=0; i<ar.length; i++){
      if(ar[i]>max){
        max=ar[i];
        System.out.println(max);
      }
    }
    System.out.println(LinearSearch(ar,max));
  }
    public static int LinearSearch(int arr[], int k){
      for(int x=0; x<arr.length; x++){
        if(arr[x]==k){
          return x;
        }
        
      }
      return -1;
      
    } 
    
    
  }