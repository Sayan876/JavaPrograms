 class BankEmp 
{
		 int sal = 40000;
		 
		 
}

		public class clerk extends BankEmp
		{
		 int DA = 20000;
		 public static void main(String[]args)
		 {
		 clerk obj = new clerk();
		 System.out.println("The salary of the " + obj.sal);
		 System.out.println("The da is " + obj.DA);
		 }
		}
