public class Pattern6
{
	public static void main(String arg[])
	{
		/*
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 5; k >= i; k--)
			{
				System.out.print("*");
			}
			for(int l = 4; l >= i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		/*
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 11; k > i*2; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		for(int i = 5; i >= 1; i--)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k < i*2; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}