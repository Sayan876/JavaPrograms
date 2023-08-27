// A Java Mathod of Function invoking programm.-+

import java.util.*;
public class sumreturn{
//methodof function defination
  // int s=
   public int Add(int m, int n)//retun outcome int from s;// m & n is our format parameters
   {
    int s = 0;
    s = m + n;
    return(s);//return s as an int Datatype
   }
   
   // actual Caller Programme
   public static void main(String[] args)//this is the caller programe which receive value from function Add()
   {
   int a,b,p;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first one ");
   a = sc.nextInt();
   System.out.println("Enter the second one ");
   b = sc.nextInt();
   sumreturn obj = new sumreturn();// creat new object obj of class type sumreturn
   
   p = obj.Add(a, b);// invoking of a function Add(int m,intn)//p=s recived the value of s
   
   System.out.println("The sum(the value 0f P veriable which is actual the value recived from reutun s )" + p);
   System.out.println("int m,int n are Formaal Parameters");
    System.out.println(" and  a, b are Actual Parameters");
   }
   
}