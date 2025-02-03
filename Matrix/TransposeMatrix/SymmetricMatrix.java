public class SymmetricMatrix
{
	public static void main(String arg[])
	{
		int a[][] = {{11,22,33}, {22,88,66}, {33,66,44}};
		int c[][] = new int [a.length][a.length];
		
		System.out.println("The given matrix is : ");
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
				c[j][i] = a[i][j];
			}
		}

		System.out.println("The Transpose matrix c is : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(a[i][j] != c[i][j])
				{
					count++;
				}
			}
		}
		if(count > 0)
		{
			System.out.println("The matrix is not Symmetric");
		}
		else
		{
			System.out.println("The matrix is Symmetric");
		}
		
		
	}
}