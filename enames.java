import java.util.*;
public class enames{
  public static void main(String[] args)
  {  
  Scanner sc = new Scanner(System.in);
  int size;
  System.out.println("Tell us how many employees");
  size = sc.nextInt();
  String empname[] = new String[size];
  int salary[] = new int[size];
  
  int i;
  System.out.println("Enter the names and their salaries");
  for(i = 0; i<size; i++)
  {
  empname[i]=sc.next();
  salary[i]=sc.nextInt();
  }
  System.out.println("The names and salary of the employees you put");
  System.out.println("Name  Salary");
  for(i = 0; i<size; i++){
  System.out.println(empname[i] + ": " + salary[i]);
  }
  /* for(i = 0; i<4; i++){
	  System.out.println(salary[i]);
  } */
  }
}