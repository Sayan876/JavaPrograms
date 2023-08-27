import java.util.*;
public class metharray{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  int i,size;
  System.out.println("Enter the size of the array");
  size = sc.nextInt();
  int arr[] = new int[size];
  
  System.out.println("Enter the elements ");
  for(i=0; i<size; i++)
  {
  arr[i]=sc.nextInt();
  }
  
  System.out.println("The elements are ");
  for(i=0; i<size; i++)
  {
  System.out.println(arr[i]);
  }
  
/*   public static void main(String[] args){
  metharray m1 = new metharray();
  m1.entry();
  //m1.ar();
  m1.display(); */
  }
  }