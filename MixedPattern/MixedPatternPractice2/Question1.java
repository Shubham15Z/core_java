/*

*
# #
* * * 
# # # #
* * * * *
# # # # # #

*/

public class Question1
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i % 2 == 1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}