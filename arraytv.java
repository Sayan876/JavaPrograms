import java.util.*;
public class arraytv{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i,j,s=0;
	String company;
	int price;
	System.out.println("Enter how many tv sets");
	j = sc.nextInt();
	for(i=0; i<j; i++){
		s=s+1;
		System.out.println("Tv Set " + s);
	System.out.println("OK, What's the Brand?");
	company = sc.next();
	System.out.println("How much is it?");
	price = sc.nextInt();
	System.out.println("The brand is " + company + " and the price is " + price);
	System.out.println("-------------------------------------------------------");
	}
	}
}