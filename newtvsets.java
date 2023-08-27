import java.util.*;
public class newtvsets {

    public void tv1(){
        
        int size;
        int price;
        String company;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of the first product");

        System.out.println("What's the screensize?");
        size = sc.nextInt();
        System.out.println("Size: " + size);

        System.out.println("How much is it?");
        price = sc.nextInt();
        sc.nextLine();
        System.out.println("Price: " + price);

        System.out.println("What's the brand");
        company = sc.nextLine();
        System.out.println("Name of the Brand: " + company);

        

        System.out.println("Details of the first product");
        System.out.println("Screensize: " + size);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + company);
    }

    public void tv2(){
        
        int size;
        int price;
        String company;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of the second product");

        System.out.println("What's the screensize?");
        size = sc.nextInt();
        System.out.println("Size: " + size);

        System.out.println("How much is it?");
        price = sc.nextInt();
        sc.nextLine();
        System.out.println("Price: " + price);

        System.out.println("What's the brand");
        company = sc.nextLine();
        System.out.println("Name of the Brand: " + company);

        

        System.out.println("Details of the second product");
        System.out.println("Screensize: " + size);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + company);
    }

    public void tv3(){
        
        int size;
        int price;
        String company;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of the third product");

        System.out.println("What's the screensize?");
        size = sc.nextInt();
        System.out.println("Size: " + size);

        System.out.println("How much is it?");
        price = sc.nextInt();
        sc.nextLine();
        System.out.println("Price: " + price);

        System.out.println("What's the brand");
        company = sc.nextLine();
        System.out.println("Name of the Brand: " + company);

        

        System.out.println("Details of the third product");
        System.out.println("Screensize: " + size);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + company);
    }
    
    public static void main(String []args) {
        newtvsets n1 = new newtvsets();
        n1.tv1();

        System.out.println("-----------------------------------------");

        newtvsets n2 = new newtvsets();
        n2.tv2();

        System.out.println("-----------------------------------------");

        newtvsets n3 = new newtvsets();
        
        System.out.println("-----------------------------------------");
        
        n3.tv3();
    }
}
