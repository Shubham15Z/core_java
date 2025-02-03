//1. Write a Java program to add two matrices of the same size.

public class Question1
{
	public static void main(String arg[])
	{
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

		int c[][] = new int [a.length][a.length];

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("The matrix elements after addition are : ");
		for(int i = 0; i < c.length; i++)
		{
			for(int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}