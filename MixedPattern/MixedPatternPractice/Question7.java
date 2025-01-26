/*

5*4*3*2*1
4*3*2*1
3*2*1
2*1
1

*/

public class Question7
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
			{
				if(j>1)
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