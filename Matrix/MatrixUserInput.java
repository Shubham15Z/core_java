import java.util.Scanner;
public class MatrixUserInput
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column size respectively : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int a[][] = new int [row][col];

		System.out.println("Enter the elements in array : ");

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				a[i][j] = sc.nextInt();
			}
			
		}

		System.out.println("The array elements are : ");
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