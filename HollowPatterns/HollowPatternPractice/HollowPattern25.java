public class HollowPattern25
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 1; k <= i; k++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= 5; j++)
			{
				if(i == 1 || i == 5 || j == 1 || j == 5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}