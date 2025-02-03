/*
14. Write a Java program to perform scalar multiplication on a matrix.
*/
public class Question14
{
	public static void main(String arg[])
	{
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int k = 2;
		
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
			for(int j = 0; j < a[i].length; j++)
			{
				a[i][j] = k * a[i][j];
			}
		}

		System.out.println("The matrix elements after scalar multiplication by "+k+" is : ");
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