/*
24. Print a spiral pattern with numbers and stars.

1 2 3 4 5
* * * * 6
* * * * 7
* * * * 8
* * * * 9
*/

public class Question24
{
	public static void main(String arg[])
	{	
		int n = 1;
		for(int i = 1; i <= 5; i++)
		{
			if(i == 1)
			{
				for(int j = 1; j <= 5; j++)
				{
					System.out.print(n+" ");
					n++;
				}
			}
			else
			{
				for(int j = 1; j <= 5; j++)
				{
					if(j < 5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(n);
						n++;
					}			
				}
			}
			System.out.println();
		}
	}
}