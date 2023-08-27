import java.util.*;

public class dynaString {
  public static void main(String[] args) //throws IOException
  {
   int size,i;
  // String n;
   Scanner sc = new Scanner(System.in);
   size = sc.nextInt();
   String s[] = new String[size];
   System.out.println("Now enter the names of studens as array elements "); //
   
   for(i = 0; i<size; i++)
   {
    s[i] = sc.next();
   }
   
   System.out.print("The names you have entered as array elements ");
   for(i = 0; i<size; i++)
   {
    System.out.println(s[i] + " ");
	//System.out.println(name[i] + " ");
   }
  }
}