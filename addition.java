import java.io.*; //This is program for taking data from keyboard.
public class addition {
public static void main(String args[])throws IOException
{
int a, b;
int s;

InputStreamReader Read = new InputStreamReader(System.in);//We create an object Read of class input InputStreamReader which already defined in java.io package 
BufferedReader in = new BufferedReader(Read); // We create an object in of class BufferedReader which already defined in java.io package to catch the value of object Read 
System.out.println("Enter your 1st No.");
a = Integer.parseInt(in.readLine());

System.out.println("Enter your 2nd No.");
b = Integer.parseInt(in.readLine());
s = a + b;
System.out.println("The sum of the two no is:= " + s);
}
}