/*

15*14*13*12*11
10*9*8*7
6*5*4
3*2
1

*/

public class Question3
{
	public static void main(String arg[])
	{
		int n = 15;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				if(j>i)
				{
					System.out.print(n+"*");
					n--;
				}
				else
				{
					System.out.print(n);
					n--;
				}
			}
			System.out.println();
		}
	}
}