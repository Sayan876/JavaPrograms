
 import java.util.*;

class Room
{
  
 void area(int x,int y)// formal parameter
  {
	  int a;
	  a=x*y;
	 System.out.println("The area is " +a);
  }

 
 /* void displayr(){
				System.out.println("The area is " +a);
				} */
}
class BedRoom extends Room {
 String color1 = "Red";
 
 void displayb(){
 System.out.println("The color of the bedroom" +color1);
 }
}

class DrawingRoom extends Room {
 String color2 = "Blue";
 void displayc(){
 System.out.println("The color of the drawing room" +color2);
 }
}

class intest {
 public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();	
	 
 Room obj = new Room();
 obj.area( m,n);// actual parameter 
 
 BedRoom obj2 = new BedRoom();
 obj2.displayb();
 
 DrawingRoom obj3 = new DrawingRoom();
 obj3.displayc();
 
 }
}