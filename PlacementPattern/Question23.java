/*
23. Print a zigzag pattern with numbers and stars.

1*2
*3*4
5*6
*7*8
*/

public class Question23
{
	public static void main(String arg[])
	{	
		int n = 1;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 2; j++)
			{
				if(i % 2 == 0)
				{
					System.out.print("*"+n);
				}
				else
				{
					System.out.print(n);
					if(j < 2)
					{
						System.out.print("*");
					}
				}
				n++;
			}
			System.out.println();
		}
	}
}