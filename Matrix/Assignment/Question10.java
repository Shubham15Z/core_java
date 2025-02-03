/*
10. Write a Java program to find the minimum element in a matrix.
*/

public class Question10
{
	public static void main(String arg[])
	{
		int a[][] = {{50,40,60},{80,20,90},{70,10,30}};
		System.out.println("The matrix elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int min = a[0][0];
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(a[i][j] < min)
				{
					min = a[i][j];
				}
			}
		}
		System.out.println("The minimum element of matrix is : "+min);	
	}
}
















