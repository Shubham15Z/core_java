/*
Q12
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5

*/

public class Question12
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}