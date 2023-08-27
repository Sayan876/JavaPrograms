public class Rectangle {
    
	     
		 int l = 10;
		 int w = 8;
		 int a;
		 
		 
		void calArea()
		 {
		 a = l*w;
		 }
		 
		 void DisplayArea()
       {
	   System.out.println("The Area = " + a);
	   }		
	   
	   public static void main(String[] args) {
	   Rectangle R1 = new Rectangle();
	   R1.calArea();
	   R1.DisplayArea();
	   
	   System.out.println("----------------------------");
	   
	   Rectangle R2 = new Rectangle();
	   R2.calArea();
	   R2.DisplayArea();
	   
	   }
}