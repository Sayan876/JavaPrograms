import java.util.*;
class Room 
{
	Scanner sc = new Scanner(System.in);
	
	int l, b;
	
	
	System.out.println("Enter the lenght");
	l = sc.nextInt();
	System.out.println("Enter the width");
	b = sc.nextInt();

	int area = l * b;
	System.out.println("The area is : " + area);
	
	
}	

class bedroom extends Room
{
	String colorb = "Red";
	void displayb()
	{
	System.out.println("The color of the bedroom is " + colorb);
	} 
} 

class drawingroom extends Room
{
	String colord = "Blue";
	void displayd()
	{
	System.out.println("The color of the drawing room is " + colord);
	}
}


class inherit
{
	public static void main(String[]args)
	{
		
		bedroom bed = new bedroom();
		bed.displayb();// color of the bedroom will display through this method invoking process
		System.out.println(" The area of bedroom is " + bed.area);// The area of base class Room is derived by subclass bedroom using dot opereator 
		System.out.println("--------------------------------------------------------------------");
		/* drawingroom drw = new drawingroom();
		System.out.println("The area of drawing is " + drw.area); // The area of the base class Room is derived by subclass drawingroom using dot operator 
		drw.displayd();/ *// color of the drawing room will display through this methid invoking process 
	}
} 