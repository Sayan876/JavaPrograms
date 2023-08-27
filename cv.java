import java.util.*;
public class cv{
    void show(int m, int n)
	{
	m = m + 2;
	n = n + 2;
	
	System.out.println("The valus of Formal parameter1 m= " + m );
	System.out.println("The valus of Formal parameter2 n= " + n );
	}

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	cv obj = new cv();
	int x;
	int y;
	System.out.println("Enter the first actual parameter x");
	x = sc.nextInt();
	System.out.println("Enter the second actual parameter y");
	y = sc.nextInt();
	
	obj.show(x,y);//call by value methode callinh process

	System.out.println("---------------------------------------");
	
	System.out.println("The values of actual parameter1 x= " + x );
	System.out.println("The values of actual parameter2 y= " + y);
	}


}