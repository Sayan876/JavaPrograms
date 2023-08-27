import java.util.*;
public class newa {
    public void carea() {
        Scanner sc = new Scanner(System.in);
        
        int l, w, a;
        System.out.println("Enter the lenght");
        l = sc.nextInt();

        System.out.println("Enter the width");
        w = sc.nextInt();

        a = l * w;

        System.out.println("The area of the first rectangle " + a);
    
        
    }

    public void carea2() {
        Scanner sc = new Scanner(System.in);

        int l, w, a;
        System.out.println("Enter the lenght");
        l = sc.nextInt();

        System.out.println("Enter the widht");
        w = sc.nextInt();

        

        a = l * w;
        System.out.println("The area of the second rectangle " + a);
    }


    public static void main(String[] args) {

    newa c1 = new newa();
    c1.carea();
    
    System.out.println("---------------------------------");

    newa c2 = new newa();
    c2.carea2();
    }
}