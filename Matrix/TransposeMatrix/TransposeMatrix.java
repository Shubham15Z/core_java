public class TransposeMatrix
{
	public static void main(String arg[])
	{
		int a[][] = {{11,22,33}, {77,88,99}, {66,44,55}};
		
		System.out.println("The given matrix is : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("The Transpose matrix is : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}