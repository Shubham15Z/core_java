/*
18.
    E
   D D
  C C C
 B B B B
A A A A A
*/

public class Question18
{
	public static void main(String arg[])
	{
		char ch = 'E';
		for(int i = 1; i <= 5; i++)
		{
			char ch1 = ch;
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print(ch1+" ");
			}
			ch--;
			System.out.println();
		}
	}
}