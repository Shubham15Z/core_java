/*
30. Print a pattern with numbers in the shape of a star.

  1
 2*3
4*5*6
 2*3
  1
*/

public class Question30
{
	public static void main(String arg[])
	{
		int n = 1;
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 2; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(n);
				n++;
				if(j < i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		int m = 2;
		for(int i = 2; i > 0; i--)
		{
			for(int j = i; j <= 2; j++)
			{
				System.out.print(" ");
			}
			
			int temp = m;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(temp);
				temp++;
				if(j < i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
			m = m-(i-1);
		}
		
	}
}