/*

4*3*2*1
4*3*2*1
4*3*2*1
4*3*2*1

*/

public class Question1
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 4; j >= 1; j--)
			{
				if(j>=2)
				{
					System.out.print(j+"*");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}