/*
2. Print an inverted pattern with alternating stars and numbers.

1*2*3
1*2*
1*2
1*
1

*/

public class Question2
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 0; i--)
		{
			int n = 1;
			for(int j = 1; j <= i; j++)
			{
				if(j%2 != 0)
				{
					System.out.print(n);
					n++;
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}