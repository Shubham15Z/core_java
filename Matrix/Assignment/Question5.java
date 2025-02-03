/*
5. Write a Java program to check if a matrix is diagonal.
*/

public class Question5
{
	public static void main(String arg[])
	{
		int a[][] = {{10,0,0},{0,20,0},{0,0,30}};
		System.out.println("The matrix elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		boolean isDiagonal = true;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(i == j)
				{
					continue;
				}
				else if(a[i][j] != 0)
				{
					isDiagonal = false;
				}
			}
		}
		if(isDiagonal)
		{
			System.out.println("The matrix is Diagonal matrix");
		}
		else
		{
			System.out.println("The matrix is not Diagonal matrix.");
			
		}
	}
}