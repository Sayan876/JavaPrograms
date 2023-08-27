// java programe using function receiving values and retruning outcome to the caller progame
import java.util.*;
//
public class factorial
{
	//a fucntion fact which receiving value x and returning outcome f.
  public int fact(int x)//formal parameter x
  {
  int f=1,i;
  for(i =1; i<=x; i++)
	{
		f = f*i;
	}
		return(f);
	}
   

   public static void main(String[] args) // caller program
  {
   int p,y;
   Scanner sc = new Scanner(System.in);
   factorial obj = new factorial();
   System.out.println("Enter the value whose factorial will be calculate ");
   y = sc.nextInt();
   p = obj.fact(y);//1x2x3x4x5=5!=120  // Here y is the actual parameter.x=y( the value of y assinged to x)
   System.out.println("The Factorial Value is:" + p);
   
  }  
}