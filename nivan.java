import java.util.*;
public class nivan{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int num, sum=0,d,p;
  System.out.println("Enter the number");
  num = sc.nextInt();
  System.out.println("You entered " + num);
  p = num;
  do
  {
   d = num%10;
   sum=sum+d;
   num=num/10;
  }
  while(num!=0);
  if(p%sum==0)
  System.out.println(" Niven number");
  else
  System.out.println(" Not a niven number");
  }
}