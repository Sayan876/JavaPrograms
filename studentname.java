public class studentname{
  public static void main(String[] args)
  {
	  int i;
   String s[] = new String[5];
   s[0] = "Ram";
   s[1] = "Harry";
   s[2] = "Mike";
   s[3] = "Chris";
   s[4] = "Ada";
   
   System.out.println("The names of the students");
   
   for(i = 0; i<5; i++)
   {
    System.out.println(s[i]);
   }
   
  }
}