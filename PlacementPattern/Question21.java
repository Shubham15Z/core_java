/*
21. Print a pattern with stars on one half and numbers on the other.

*****12345
****1234
***123
**12
*1
*/

public class Question21
{
	public static void main(String arg[])
	{	
		for(int i = 5; i >=1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}