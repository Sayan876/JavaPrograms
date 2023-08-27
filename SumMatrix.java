import java.util.*;
public class SumMatrix{
   public static void main(String[] args)
   {
   Scanner sc = new Scanner(System.in);
   
   int i,j,row,column,sum = 0;                             //taken another integer variabe (sum = 0) 
   System.out.println("Enter the number of the rows");
   row = sc.nextInt();
   System.out.println("Enter the number of the columns");
   column = sc.nextInt();
   
   int arr[][] = new int[row][column];
   
   System.out.println("Enter the elements of matrix");
   for(i=0;i<row;i++)
   {
    for(j=0;j<column;j++)
	{
	 arr[i][j] = sc.nextInt();
	}
   }
    System.out.println("Elements of the matrix");
	for(i=0;i<row;i++)
	{
	 for(j=0;j<column;j++)
	 {
	  System.out.print(arr[i][j] + "\t");
	 }
	 System.out.println();
	}                                                    //Here we just finished the Matrix part.
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			sum = sum + arr[i][j];                        //Applying the formula of summation of Matrix sum = sum + arr[i][j](The array the you set)
		}
	}
	System.out.println("Summation of the elements of the matrix = " + sum);
   }
}