import java.io.*;
public class nRectangle 
{

public void calArea1()throws IOException
{
int l, w;
int a;
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
System.out.println("The the 1stRect length");
 l = Integer.parseInt(in.readLine());
 System.out.println("The the 1stRect bredth");
 w = Integer.parseInt(in.readLine());
a = l * w;
System.out.println("The area is " + a);

}

public void calArea2()throws IOException
{
int l, w;
int a;
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
//System.out.println("---------------------------------------------------------------------");
System.out.println("The the 2ndRect length");
 l = Integer.parseInt(in.readLine());
 System.out.println("The the 2ndRect bredth");
 w = Integer.parseInt(in.readLine());
a = l * w;
System.out.println("The area is " + a);

}


public static void main(String args[])throws IOException 
{
nRectangle r1 = new nRectangle();
r1.calArea1();
System.out.println("---------------------------------------------------------------------");

nRectangle r2 = new nRectangle();
r1.calArea2();


}

}