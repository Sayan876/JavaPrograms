import java.util.*;
public class cm()
{
	int n1,n2,a,s,m,d,r;
	


void entry(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first digit.");
	n1 = sc.nextInt();
	System.out.println("Enter the second digit. ");
	n2 = sc.nextInt();
		}
void cal(){
			a = n1 + n2;
			s = n1 - n2;
			m = n1 * n2;
			d = n1 / n2;
			r = n1 % n2;
		}
void display(){
				System.out.println("The addition " + a);
				System.out.println("The substraction " + s);
				System.out.println("The multiplication " + m);
				System.out.println("The division " + d);
				System.out.println("reminder " + r);
			}

public static void main(String[] args)
		{
		cm obj1 = new cm();
		obj1.entry();
		obj1.cal();
		obj1.display();
		}

}
