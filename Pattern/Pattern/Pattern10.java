public class Pattern10
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 5; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}