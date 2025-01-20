public class HollowPattern28
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				if(k == 1 || i == k)
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
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 4; k >= i; k--)
			{
				if(k == 4 || k == i )
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