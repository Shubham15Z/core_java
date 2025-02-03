public class MatrixAddition
{
	public static void main(String arg[])
	{
		int a[][] = {{10,20,30}, {10,20,30}, {10,20,30}};
		int b[][] = {{1,2,3},{4,5,6,},{7,8,9}};
		
		//System.out.println(a[0].length);
		int c[][] = new int [a.length][a.length];
		

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				//System.out.print(a[i][j]+b[i][j]+" ");
				c[i][j] = a[i][j]+b[i][j];
			}
		}

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