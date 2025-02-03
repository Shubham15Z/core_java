public class MatrixFloat
{
	public static void main(String arg[])
	{
		float a[][] = {{12.5f, 80.9f, 74.2f}, {5.6f, 50.4f, 34}, {20.456f, 56, 0.01f}};
	
		System.out.println("The float elements in matrix are : ");
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