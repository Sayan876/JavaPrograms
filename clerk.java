 class BankEmp 
 
 {
	int sal = 40000;
	int HR=1500;
	
		 
 } 

class clerk extends BankEmp 
	{
		 //int sal = 40000;
	 int DA = 20000;
	 
	 void display()
	 {
		
		 System.out.println("The salary of the " +DA);
		 
	 }
	 
	 public static void main(String[]args)
	 {
			  clerk obj = new clerk();
			  /* System.out.println("The salary of the " + obj.sal);
			  System.out.println("The da is " + obj.DA); */
			  
			   obj.display();
			  
			   System.out.println("The salary of the " +obj.sal);
			    System.out.println("The salary of the " +obj.HR);
			  
			  
			  
			 }
		
}		
 