/*


* # * # * #
* # * # *
* # * #
* # * 
* #
* 

*/

public class Question5
{
	public static void main(String arg[])
	{
		for(int i = 6; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j % 2 == 1)
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