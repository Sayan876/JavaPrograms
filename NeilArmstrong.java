import java.util.*;
public class NeilArmstrong {

    public void arm() {
        Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number you want to check ");
		number = sc.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
	public static void main(String[] args){
		NeilArmstrong nam = new NeilArmstrong();
		nam.arm();
		
	}
}