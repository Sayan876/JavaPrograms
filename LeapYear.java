import java.util.*;
public class LeapYear {
   public void lp(){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified(" + year + ")year is a leap year");
      else
         System.out.println("Specified(" + year + ")year is not a leap year");
   }
   public static void main(String[] args)
   {
    LeapYear ly = new LeapYear();
	ly.lp();
   }
   
}