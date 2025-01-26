/*


* * * * * *
# # # # #
* * * *
# # #
* * 
#

*/

public class Question3
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 6; i++)
		{
			for(int j = i; j <= 6; j++)
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