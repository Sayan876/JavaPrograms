import java.util.*;
public class Reversearray{
   public static void main(String[] args){
    int i;
	
    Scanner sc = new Scanner(System.in);
	int size;
	System.out.println("Enter the size of the array");
	size = sc.nextInt();
	int arr[] = new int[size];
	
	System.out.println("Good! Now enter the elements of the array");
	for(i=0; i<size; i++){
	 arr[i]=sc.nextInt();
	}
	System.out.println("-:The original array:-");
	for(i=0; i<size; i++)
	{
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println("The reversed array is ");
	for(i = size-1; i>=0; i--) //formula of reversing an array.
	{
	System.out.print(arr[i] + " ");
	} 
   }
}