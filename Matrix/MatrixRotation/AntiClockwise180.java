public class AntiClockwise180
{
	public static void main(String arg[])
	{
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};

		System.out.println("The matrix elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The matrix elements after 180 degree Anti clockwise rotation are : ");
		for(int i = a.length-1; i>=0; i--)
		{
			for(int j = a.length-1; j>=0; j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}