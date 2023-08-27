import java.util.*;
public class factorial3{
   public void fact(){
   Scanner sc = new Scanner(System.in);
   int x, f = 1, i;
   System.out.println("Enter the value ");
   x = sc.nextInt();
   for(i=1;i<=x;i++){
   f = f*i;
   }
   System.out.println("The factorial is " + f);
   }
   
   public static void main(String[] args){
   factorial3 obj = new factorial3();
   obj.fact();
   }
}