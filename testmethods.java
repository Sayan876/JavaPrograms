
import java.lang.*;
class A extends Thread
{
 public void run()
 {
  for(int i = 1; i<=5; i++)
  {
  if(i==1) yield();
  System.out.println("\tFrom Thread A : i = " + i);
  }
  System.out.println("Exit From A");
 }
}
class B extends Thread
{
 public void run()
 {
 for(int j = 1; j<=5; j++)
 {
 System.out.println("\tFrom thread B : j = " + j);
 if(j==3) stop();
 }
 System.out.println("Exit from B");
 }
}
class C extends Thread
{
 public void run()
 {
  for(int k =1;k<=5; k++)
  {
  //System.out.println("t\From thread C : k = " + k);
  if(k==1)
	  try
		 {
		 sleep(1000);
		 }
      catch (exception e)
		 {
			 
		 } 
  }
  System.out.println("Exit from C ");
 }
}

class testmethods
{
  public static void main(String[] args)
  {
   A threadA = new A();
   B threadB = new B();
   C threadC = new C();
   System.out.println("Start thread A");
   threadA.start();
   System.out.println("Start thread B");
   threadB.start();
   System.out.println("Start thread C");
   threadC.start();
   System.out.println("End of the main Thread ");
  }
}