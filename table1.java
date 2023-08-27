import java.util.*;
public class table1{
   public static void main(String[] args){
   int i,j;// row col loop veriables
   Scanner sc = new Scanner(System.in);//sc data entry obj
   int t[][] = new int[2][3];// 2dArray
   System.out.println("Enter Ther elements of the 2D array " );
   
   //this for llop for dataEntry in Arrray Elements
   
   for (i=0; i<2; i++){
						for(j=0; j<3; j++){
											t[i][j]=sc.nextInt();
										  }
					   System.out.println("............... ");
                       }
					
 /*  System.out.println("The element of the 2 dimentional array " + t[0][0]);
  System.out.println("The element of the 2 dimentional array " + t[0][1]);
  System.out.println("The element of the 2 dimentional array " + t[0][2]);
  System.out.println("The element of the 2 dimentional array " + t[1][0]);
  System.out.println("The element of the 2 dimentional array " + t[1][1]);
  System.out.println("The element of the 2 dimentional array " + t[1][2]); */
  
  
  // this for loop for Array Display.
  
  System.out.println("The elements of the 2d array looks like below ");
  
   for(i=0; i<2; i++){
						for(j=0; j<3; j++){
											System.out.print(t[i][j] + "| ");
											
										}
										
										System.out.println();
					}
   
  
   
}
}