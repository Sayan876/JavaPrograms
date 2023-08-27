import java.io.*;

public class interest {
	
	
	
 void calinterest(int p, int t, int r)
  {
  int i = (p * t * r)/100;
  System.out.println("The interest=" + i);
  }
	
	
	
  public static void main (String args[] )
  {
    System.out.println("This a simple program using function argument which accept value from the user as a argument parameter");
    interest IT=new interest();
	IT.calinterest(100,3,5);
	
	System.out.println("----------------------");
	
	IT.calinterest(500,12,9);
   
  } 
}