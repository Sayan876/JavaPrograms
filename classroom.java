
//Program for method overloading 

public class classroom{
  
  public void Room(int x, int y){
   int ar;
   ar = x * y;
   System.out.println("The area of rectangle is " + ar);
   }
  
  public void Room(int a){
   int as;
   as = a*a;
   System.out.println("The area of square is " + as);
   }
  

   public static void main(String[]args){
  
  classroom obj = new classroom();
   obj.Room(4,5);
   obj.Room(3);
   
   }

}