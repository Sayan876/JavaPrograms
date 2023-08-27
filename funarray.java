import java.util.*;
public class funarray{
  //public static void main(String[] args){
  Scanner sc = new Scanner(System.in);	
  int i,size;
  
  void entry(){
  System.out.println("Enter the size of the array");
  size = sc.nextInt();
  int arr[] = new int[size];
  System.out.println("Enter the elements");
  for(i=0; i<size; i++){
  arr[i]=sc.nextInt();
  }
  //}
  
  //void display(){
  System.out.println("The elements");  
  for(i = 0; i<size; i++){
  System.out.println(arr[i]);
  }
  }
  public static void main(String[] args){
  funarray f1 = new funarray();
  f1.entry();
  //f1.display();
  }
}
//}
