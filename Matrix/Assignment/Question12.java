/*
12. Write a Java program to find the frequency of a given element in a matrix.
*/

public class Question12
{
	public static void main(String arg[])
	{
		int a[][] = {{10,40,60},{80,20,90},{70,50,20}};
		int n = 20;
		System.out.println("The matrix elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(a[i][j] == n)
				{
					count++;
				}
			}
		}
		System.out.println("The frequency of "+n+" in matrix is : "+count);	
	}
}