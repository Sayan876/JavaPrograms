class BankWorker 
{
 int sal = 40000;
}



class clerk2 extends BankWorker
{
			int DA = 20000;

			void display()
			{
			System.out.println("The salary is " +sal);
			System.out.println("The DA is " +DA);
			}
			public static void main(String[] args)
			{
			clerk2 obj = new clerk2();
			obj.display();
			System.out.println("The salary is " +obj.sal);
			
			}
		
}