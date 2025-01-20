/*

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/

public class HollowPattern21
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int k = i; k <= 5; k++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				if(i == 1 || j == 1 || i == j)
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

		for(int i = 1; i <= 5; i++)
		{
			for(int k = 0; k <= i; k++)
			{
				System.out.print(" ");
			}
			for(int j = 4; j >= i; j--)
			{
				if(j == 4 || j == 1 || i == j)
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