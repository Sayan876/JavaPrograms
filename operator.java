//Program to know about prefix incremental operator.

public class operator {
public static void main(String[] args){
int i = 5;
int j=5;
System.out.println("The initial value of i " + i);
System.out.println("The initial value of j " + j);

int y = ++i*4;
System.out.println("The value of y = " + y);// increment
System.out.println("The final value of i = " + i);

int m = --j*2;
System.out.println("The value of m =" + m);//decrement
System.out.println("The value of i =" + j);
 }
}