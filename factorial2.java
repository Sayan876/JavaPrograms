//without returning (also known as conditon 2)
import java.util.*;
public class factorial2 {
	public void fact(int x) 
	{
	int f=1,i;
    for(i=1; i<=x; i++)
	{
		f = f*i;
	}
     System.out.println("The factorial is " + f);	
	}
	public static void main(String[] args){
		int y;
		Scanner sc = new Scanner(System.in);
		factorial2 obj = new factorial2();
		System.out.println("Enter the value x ");
		y = sc.nextInt();
		obj.fact(y);
		//System.out.println("The factorial value is " + y);
		
	}
}