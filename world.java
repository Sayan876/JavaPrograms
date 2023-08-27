public class world {
	
	int i=12;
	String nam="ram";
	void display()// non-static method
	{
		System.out.println("age:-"+i);
		System.out.println("Name are:-" + nam);
		
	}
	
     public static void main(String[]args) // static method
	 {	 
	 System.out.println("Hello world");
	 
	  world obj=new world();
	  obj.display();
	 }

}