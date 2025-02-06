/*
13. Print a pattern with a checkerboard of numbers and stars.

1*2*3
*4*5*
6*7*8
*9*0*
*/

public class Question13
{
	public static void main(String args[])
	{
		int n = 1;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(i%2 != 0)
				{
					if(j%2 == 0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(n);
						n++;
					}	
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