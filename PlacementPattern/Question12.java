/*
12. Print a hollow square with numbers and stars in the center.

*****
*1*2*
*3*4*
*5*6*
*****
*/

public class Question12
{
	public static void main(String args[])
	{
		int n = 1;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(i == 1 || i == 5 || j == 1 || j == 5)
				{
					System.out.print("*");
				}
				else
				{
					if(j%2 == 0)
					{
						System.out.print(n);
						n++;
					}
					else
					{
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
		}
	}
}
