import java.util.*;
public class primenumber 
    {
	public void cprime(int n){
	int i,m=0,f=0;
	m=n/2;
	if(n==0||n==1){
	System.out.println(n + " is not a prime number.");
	}
	else
	{
	for(i=2; i<=m; i++){
	if(n%i==0){
	System.out.println(n + " is not a prime number.");
	
	break;
	}
	}
	if (f == 0){ 
	System.out.println(n + " is prime number"); 
	}  
	}
	}
	public static void main(String[] args){
	int y;
	Scanner sc = new Scanner(System.in);
	primenumber obj = new primenumber();
	System.out.println("Enter the number you want to check");
	y = sc.nextInt();
	obj.cprime(y);
	}
	}