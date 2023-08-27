import java.util.*;
public class studentn{
  public static void main(String[] args){
   int size, i;
  
   Scanner sc = new Scanner(System.in);//user input neowar janya sc scanner object nilam
   
   System.out.println("Enter the size of the array");
   size = sc.nextInt();// nijer motokore size nite habe
   
    String str[] = new String[size]; // array1:- this string array is used for student name.
	int rollno[] = new int[size]; //  array2:-this integer array is used for student's roll numbers.
   
  // String str[] = new String[size];
   for(i = 0; i<size; i++) //this loop for data entry
   { 
    System.out.println("The name of the student ");
    str[i] = sc.next();// array1 name store hocche
	System.out.println("The roll numbers of students ");
	rollno[i] = sc.nextInt();// array2 Roll no store hocche
   }
   
   System.out.println("The names and roll numbers are as an arrray elements ");
   for (i = 0; i<size; i++)// this loop for data disply7 
   {
   System.out.println("The name:- " + str[i] + "  Roll number:- " + rollno[i]);
   //System.out.println("Roll number " + rollno[i]); 
   }
  }
}