import java.util.Scanner;
public class freshstr {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int size;
   System.out.println("Enter the size of the array");
   size = sc.nextInt();
   String str[] = new String[size];
   int i;
   for(i = 0; i<size; i++)
   {
    str[i] = sc.next();
   }
   System.out.println("The elements of String array");
   for (i = 0; i<size; i++)
   {
    System.out.println("The string array " + str[i]);
   }
  }
}