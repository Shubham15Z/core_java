/*
* * * * *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
* * * * *
 


*/


public class HollowPattern29
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 5; k >= i; k--)
			{
				if(k == 5 || i ==1 || k == i )
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

		for(int i = 2; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				if(k == 1 || i == 5 || i == k)
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