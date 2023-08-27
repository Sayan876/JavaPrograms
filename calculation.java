import java.io.*;
public class calculation {
	
	public void mul()throws IOException //creating the first class called "mul" which stands for multiplication.
	{
    float x, y;
    float m;

    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    System.out.println("Enter the first digit ");
    x = Integer.parseInt(in.readLine());
    System.out.println("Enter the second digit");
    y= Integer.parseInt(in.readLine());
    m = x * y;
    System.out.println("The multiplication of the digits " + m);
	System.out.println("--------------------------------------");

}

    public void div() throws IOException //creating the second class called "div" which stands for division
	{
		
	float x, y;
    float d;
	
	InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
	System.out.println("Enter the first digit ");
	x = Integer.parseInt(in.readLine());
	System.out.println("Enter the second digit");
	y = Integer.parseInt(in.readLine());
	
	d = x / y;
	System.out.println("The division of the digits " + d);
	System.out.println("-----------------------------------------");
	
		
		
	}
    public static void main(String args[])throws IOException {
	calculation m1 = new calculation();
	m1.mul();
	m1.div();
 System.out.println("----------------------------------------");
    
/* 	calculation m2 = new calculation();
	m2.div(); */
}
}