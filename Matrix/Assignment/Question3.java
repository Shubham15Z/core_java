/*
3. Write a Java program to find the transpose of a matrix.
*/

public class Question3
{
	public static void main(String arg[])
	{
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int c[][] = new int [a.length][a.length];

		System.out.println("The matrix elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				c[i][j] = a[j][i];
			}
		}

		System.out.println("The Transpose matrix elements are : ");
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