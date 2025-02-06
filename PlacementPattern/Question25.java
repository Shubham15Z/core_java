/*
25. Print a cross pattern with numbers and stars.

  1
 2*3
3*4*5
 2*3
  1

*/

public class Question25
{
	public static void main(String arg[])
	{	
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 3; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int j = i; j < i*2; j++)
			{
				System.out.print(j);
				if(j < i*2-1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for(int i = 2; i >= 1; i--)
		{
			for(int j = 3; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int j = i; j < i*2; j++)
			{
				System.out.print(j);
				if(j < i*2-1)
				if(j < i*2-1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}