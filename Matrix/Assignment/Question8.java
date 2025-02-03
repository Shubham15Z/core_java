/*
8. Write a Java program to find the sum of each row and column of a matrix.
*/

public class Question8
{
	public static void main(String arg[])
	{
		int a[][] = {{10,40,60},{80,20,90},{70,50,30}};
		System.out.println("The matrix elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < a.length; i++)
		{
			int sumrow = 0;
			for(int j = 0; j < a[i].length; j++)
			{
				sumrow += a[i][j];
			}
			System.out.println("The sum of "+(i+1)+" row is : "+sumrow);
		}
		
		for(int j = 0; j < a[0].length; j++)
		{
			int sumcol = 0;
			for(int i = 0; i < a.length; i++)
			{
				sumcol += a[i][j];
			}
			System.out.println("The sum of "+(j+1)+" column is : "+sumcol);
		}
	}
}