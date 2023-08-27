
//Java program in connection with methods in class by using object.

import java.util.*;
public class cm
{
	int n1,n2,a,s,m,r;
	float d;
	


void entry()//Method for data entry
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first digit.");
	n1 = sc.nextInt();
	System.out.println("Enter the second digit. ");
	n2 = sc.nextInt();
		}
void cal() //Method for calculation.
		{
			a = n1 + n2;
			s = n1 - n2;
			m = n1 * n2;
			d = n1 / n2;
			r = n1 % n2;
		}
void display()// Method for displaying the result.
			{
				System.out.println("The addition " + a);
				System.out.println("The substraction " + s);
				System.out.println("The multiplication " + m);
				System.out.println("The division " + d);
				System.out.println("reminder " + r);
			}

public static void main(String[] args)
		{
			System.out.println("Math Operation of Object1 below ");
		cm obj1 = new cm();//object 1 of class cm
		obj1.entry();
		obj1.cal();
		obj1.display();
		System.out.println("Math Operation of Object2 below ");
		cm obj2 = new cm();//object 2 of class cm
		obj2.entry();
		obj2.cal();
		obj2.display();
		}

}
