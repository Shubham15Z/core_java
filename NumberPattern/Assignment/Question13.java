/*
Q13
     5
    4 4
   3 3 3
  2 2 2 2
 1 1 1 1 1

*/

public class Question13
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j<= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 5; k >= i; k--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}