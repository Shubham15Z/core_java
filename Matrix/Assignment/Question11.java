/*
11. Write a Java program to sort the elements of each row of a matrix.
*/

public class Question11
{
	public static void main(String arg[])
	{
		int a[][] = {{60,40,10},{80,20,90},{70,50,30}};
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
			for(int j = 0; j < a[i].length-1; j++)
			{
				for(int k = 0; k < a[i].length-j-1; k++)
				{
					if(a[i][k] > a[i][k+1])
					{
						int temp = a[i][k];
						a[i][k] = a[i][k+1];
						a[i][k+1] = temp;
					}
				}
			}
		}

		System.out.println("The matrix elements after sorting are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}