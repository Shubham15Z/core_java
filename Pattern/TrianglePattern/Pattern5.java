public class Pattern5
{
	public static void main(String arg[])
	{
		for(int i = 1; i<=10; i++)
		{
			if(i%2 != 0)
			{
				for(int j = i; j <= 10; j++)
				{
					System.out.print(" ");
				}
				for(int k = 1; k <= i; k++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}