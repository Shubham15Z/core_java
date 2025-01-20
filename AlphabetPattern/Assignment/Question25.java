/*
25.

E E E E E
 D D D D
  C C C
   B B
    A
*/

public class Question25
{
	public static void main(String arg[])
	{
		char ch = 'E';
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				System.out.print(ch+" ");
			}
			ch--;
			System.out.println();
		}
	}
}