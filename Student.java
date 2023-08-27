import java.util.*;
public class Student {

    public void student1(){
        Scanner sc = new Scanner(System.in);
        
        String name;
        String section;
        int roll;
        System.out.println("Give the details of the first Student");
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("The name of the student is " + name);
        
        System.out.println("Entet the section");
        section = sc.nextLine();
        System.out.println("The section is " + section);

        System.out.println("Enter the roll number");
        roll = sc.nextInt();
        System.out.println("The roll number is " + roll);
        
        System.out.println("Details of the first student");
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Roll number " + roll);

    }
    
    public void student2(){
        Scanner sc = new Scanner(System.in);
        
        String name;
        String section;
        int roll;
        System.out.println("Give the details of the second Student");
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("The name of the student is " + name);
        
        System.out.println("Entet the section");
        section = sc.nextLine();
        System.out.println("The section is " + section);

        System.out.println("Enter the roll number");
        roll = sc.nextInt();
        System.out.println("The roll number is " + roll);

        System.out.println("Details of the second student");
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Roll number " + roll);

    }


    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.student1();

        Student s2 = new Student();
        s2.student2();

    }
}
