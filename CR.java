import java.util.*;
public class CR
  { 
   /* public void add(int a[]){
   
   
   } */
  
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size(length) of the array element");
  int size = sc.nextInt();
  int a[] = new int[size];
  System.out.println("Enter the array elements");
  for(int i = 0; i<size; i++){
	   a[i] = sc.nextInt();
  }
 
 
   //lenght of the array
  int p = a.length;
  System.out.println("Lenght of the array " + p);
 /*  CR obj = new CR();
  obj.add(a);
  for(i = 0; i<a.length; i++){
   System.out.println(a[i]); */
  }
  
  }
  
  