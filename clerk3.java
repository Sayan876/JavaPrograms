class BankEmp3 
{
   int sal = 40000;
   int hr = 1500;
}

class clerk3 extends BankEmp3
{
   int da = 30000;

void display()
{
System.out.println("The salary is " + sal);
System.out.println("The house rent is " + hr);
System.out.println("The da is " + da);
}
public static void main(String[]args)
{
 clerk3 obj = new clerk3();
 obj.display();
}
}