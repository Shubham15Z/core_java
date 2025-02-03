import java.util.Scanner;
public class MatrixSubtractionUserInput
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column size for array a and b respectively : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int [row][col];
		int b[][] = new int [row][col];
		int c[][] = new int [row][col];

		System.out.println("Enter the elements in array a : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				a[i][j] = sc.nextInt();
			}
			
		}

		System.out.println("Enter the elements in array b : ");
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				b[i][j] = sc.nextInt();
			}
			
		}

		System.out.println("The array elements in a are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("The array elements in b are : ");
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[i].length; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				c[i][j] = a[i][j] - b[i][j];
			}
		}

		System.out.println("The Subtraction of array a and b is : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}