
import java.io.*;

public class TvSet {
   int size=32;
   int channerls=250;
   float price=10000.00F;           //data member veriabls
   
   
                                       // member function
   public void displaysize()
   {
   System.out.println("The size of the TVset= " + size);
   }

    public void displayChannel()
   {
   System.out.println("The no of Channels of the TVset= " + channerls);
   }
   
   
    public void printprice() {
		System.out.println("The price of the tv = " + price);
	}
   
   
   
   
   // main function start 
   
   public static void main( String[] args) {
	   
     TvSet Sony = new TvSet();	//sony is a new object of class TvSet.   
	 Sony.displaysize();
	 
	 TvSet LG=new TvSet(); // LG is a new object of class TvSet.   
	 LG.displayChannel();
	
	System.out.println("----------------------------------------");
	                                 //samsung is a new object of class TvSet.
	 TvSet samsung = new TvSet();
	 samsung.displaysize();
	 samsung.displayChannel();
	 
	 System.out.println("---------------------------------------");
	 System.out.println("---------------------------------------");
	 
	 TvSet mi = new TvSet();            //mi is a new object of class TvSet.
	
	 mi.printprice();
     
   
   }	
   
   
   
   
   
   
}