/*
Q7
     1
    2 1
   3 2 1
  4 3 2 1
 5 4 3 2 1

*/

public class Question7
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}