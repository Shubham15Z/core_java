public class MatrixChar
{
	public static void main(String arg[])
	{
		char a[][] = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'}};
	
		System.out.println("The characters in array are : ");
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