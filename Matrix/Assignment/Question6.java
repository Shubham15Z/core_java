/*
6. Write a Java program to find the sum of the diagonal elements of a matrix.
*/

public class Question6
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
		int sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(i == j)
				{
					sum += a[i][i];
				}
			}
		}
		System.out.println("The sum of Diagonal element of matrix is : "+sum);	
	}
}