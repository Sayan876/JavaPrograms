public class postfix {
public static void main (String[] args) {
int i = 9; 
System.out.println("The initial value of i = " + i);
int j = 9;
int y = (i++)*4 + i;
System.out.println("The value of y " + y);
System.out.println("The final value of i " + i);// incremental of i.
//System.out.println("The value of j " + j);
System.out.println("-----------------------------------------------------------------------");

System.out.println("Initial value of j = " + j);
int m = (j--) * 2;
System.out.println("The value of m " + m);
System.out.println("The final value of j " + j);


}
}