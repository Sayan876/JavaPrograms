//Java program to copy elements from a array to b array.
import java.util.*;
public class copyarray{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int i,s;
   System.out.println("Enter the size of the array ");
   s = sc.nextInt();
   int a[] = new int[s];
   int b[] = new int[s];
   System.out.println("Great! Now enter the elements in array a.");
   for(i=0; i<s; i++)
   {
   a[i] = sc.nextInt();
   }
   
   /* System.out.println("The elements of the array are ");
   for(i = 0; i<s; i++){
	   System.out.print(a[i] + " ");
   }
   System.out.println(); */
   System.out.println("Copied elements from a to be array are ");
   System.out.println();
   for(i=0; i<s; i++){
	   b[i] =  a[i];
	   
	   System.out.print(b[i] + " ");
   }
   }
}