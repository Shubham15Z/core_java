/*

* * * * *
*     *
*   *
* *
*

*/

public class HollowReverseTriangle
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
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