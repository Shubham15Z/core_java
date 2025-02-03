/*
9. Write a Java program to find the maximum element in a matrix.
*/

public class Question9
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
		int max = a[0][0];
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println("The maximum element of matrix is : "+max);	
	}
}
















