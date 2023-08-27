import java.util.*;
public class dyname{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  String empname[] = new String[4];
  for(int i=0; i<4; i++)
  {
  empname[i] = sc.next();
  }
  System.out.println("Tne names are ");
  
  for(int i=0; i<4; i++)
  {
  System.out.println(empname[i]);
  }
}

}

