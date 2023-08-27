class A extends Thread
      {
	  public void run()
	   {
	   for(int i = 1; i<=3; i++)
	    {
		System.out.println("Ram");
		}
		System.out.println("Exit A");
	   }
	  }
	  
class B extends Thread
      {
	  public void run()
	   {
	   for(int j=1; j<=3; j++)
	    {
		 System.out.println("Krishna");
		}
		System.out.println("Exit B");
	   }
	  }
	  
class C extends Thread
     {
	 public void run()
	  {
	   for(int k = 1; k<=3; k++)
	   {
	   System.out.println("Harry");
	   }
	   System.out.println("Exit C");
	  }
	 }	  
	 
class ThreadTest
 {
  public static void main(String[]args)
  {
  new A().start();
  new B().start();
  new C().start();
  }
 }	 