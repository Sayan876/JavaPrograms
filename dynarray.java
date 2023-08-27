import java.util.*;
public class dynarray{
  public static void main(String[] args)
  {
  int size,i;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of the array ");
  size = sc.nextInt();//Enter the size of the dynamic array as per our needs 
 


 // now the array is a[] whose size will be as per your choice so the size of the array will be entered during the execution of the program
  int a[] = new int[size];
  
  System.out.println("Enter the elements of the array ");
  for(i = 0; i<size; i++)
  {
	a[i] = sc.nextInt(); // Now enter the elements of the array a[i] which will be the integer value enter through keyboard or using scanner objecdt sc 
  }
   
   System.out.println("The array is ");
   
   for(i=0; i<size; i++)// to display the dynamic array which I've created can be shown using for loop where the for loop variable i=0 to i = size - 1 (< size )
   {
	   
   System.out.print(a[i] + " ");
   
   }
  }
}