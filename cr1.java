
//Program for call by reference 
public class cr1{
   public void add(int b[]){
	   int i;
       for( i = 0; i<b.length; i++){
	   b[i] = b[i] + 5;
	   }
	   for(i = 0; i<b.length;i++){
	   System.out.println("The formal parameter array is " + b[i]);
	   }
   }
   
   public static void main(String[]args){
   int a[] = {2,4,5,6,7};
    for (int k = 0; k<a.length; k++){
		System.out.println("The actual parameter is " + a[k]);
		
	}
	System.out.println("The borderline of old actual parameter");
   cr1 obj = new cr1();
   obj.add(a);// add operation is done
   System.out.println("--------------------------------The borderline between formal and actual paraeter------------------------------------------ ");
         // checking of actual parameter's status after operation below.   
   for (int j=0; j<a.length; j++){
   System.out.println("The actual parameter array is " + a[j]);
   }
   }
}