//program for perfect number.
import java.util.*;
public class perfect {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int a, n, s=0;// n is number which have to chk whethere it is perfect or not
				// s is the sum of Factors s=1+a1+a2+a3
				//a is the factor veriable(a1,a2,a3 etc).
 System.out.println("Enter the number n : ");
 n = sc.nextInt();
 for(a = 1; a<n; a++)// at the time of last chk a become n then the loop exit.
 {
 if(n%a==0)
 s=s+a;
 }
 if(s==n)

System.out.println(n + " is a perfect number");
 else

 System.out.println(n + " is not a perfect number");

}
}