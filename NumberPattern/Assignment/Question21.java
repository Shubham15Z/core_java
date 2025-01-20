/*
Q21
     9
    8 7
   7 6 5
  6 5 4 3
 5 4 3 2 1

*/

public class Question21
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++)
			{
				System.out.print((10-i-k)+" ");
			}
			System.out.println();
		}
	}
}