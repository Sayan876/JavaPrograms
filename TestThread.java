class A extends Thread
      {
	  public void run()
	   {
	   for(int i = 1; i<=5; i++)
	    {
		System.out.println("\t From ThreadA : i = " + i);
		}
		System.out.println("Exit A");
	   }
	  }
	  
class B extends Thread
      {
	  public void run()
	   {
	   for(int j=1; j<=5; j++)
	    {
		 System.out.println("\t From TreadB : j = " + j);
		}
		System.out.println("Exit B");
	   }
	  }
	  
class C extends Thread
     {
	 public void run()
	  {
	   for(int k = 1; k<=5; k++)
	   {
	   System.out.println("\t From ThreadC : k = " + k);
	   }
	   System.out.println("Exit C");
	  }
	 }	  
	 
class TestThread
 {
  public static void main(String[]args)
  {
  new A().run();
  new B().run();
  new C().run();
  }
 }	 