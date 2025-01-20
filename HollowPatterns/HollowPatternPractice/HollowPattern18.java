/*

* * * * *
  *     *
    *   *
      * *
        *

*/

public class HollowPattern18
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 1; k <= i; k++)
			{
				System.out.print("  ");
			}
			for(int j = 5; j >= i; j--)
			{
				if(i == 1 || j == 5 || j == 1 || i == j)
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