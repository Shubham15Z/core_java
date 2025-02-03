/*
7. Write a Java program to find the product of diagonal elements of a matrix.
*/

public class Question7
{
	public static void main(String arg[])
	{
		int a[][] = {{10,40,60},{80,20,90},{70,50,30}};
		System.out.println("The matrix elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int product = 1;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(i == j)
				{
					product = product * a[i][i];
				}
			}
		}
		System.out.println("The product of Diagonal element of matrix is : "+product);	
	}
}