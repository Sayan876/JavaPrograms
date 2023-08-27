import java.util.Scanner;

import java.util.*;
public class Interest 
{
    public static void main(String args[])
	{
        int p, t, r, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        p = sc.nextInt();
        System.out.println("Enter the time(in year)");
        t = sc.nextInt();
        System.out.println("Enter the rate");
        r = sc.nextInt();

        sc.close();

        i = p + (p * t * r)/100;

        System.out.println("here is the final output " + i);

    }
}