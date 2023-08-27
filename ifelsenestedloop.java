import java.util.*;
public class ifelsenestedloop {
   public static void main(String[] args){
	   int a,b,c;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number");
	   a = sc.nextInt();
	   System.out.println("You entered: " + a);
	   System.out.println("Enter the second number");
	   b = sc.nextInt();
	   System.out.println("You entered: " + b);
	   System.out.println("Enter the third number");
	   c = sc.nextInt();
	   System.out.println("You entered: " + c);
	   System.out.println("Here are the result");
    
	
	if (a>b || c>b)
	{
	 if(a>c)
	 {
	  System.out.println("The largest number is " + a);
	 }
	 else
	 {
	  System.out.println("The largest number is " + c);
	 }
	}
	else
	{
	  System.out.println("The largest number is " + b);
	}
   }
}