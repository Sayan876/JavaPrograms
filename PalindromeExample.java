import java.util.*;
public class PalindromeExample{  
 public void palm(){  
  Scanner sc = new Scanner(System.in);
  int r,sum=0,temp;    
  
  int n;//It is the number variable to be checked for palindrome  
  System.out.println("Enter the number you want to check");
  n = sc.nextInt();
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println(temp + " is  a palindrome number ");    
  else    
   System.out.println(temp + " is not a palindrome number ");    
}  
public static void main(String[] args){
PalindromeExample pm = new PalindromeExample();
pm.palm();
}

}  