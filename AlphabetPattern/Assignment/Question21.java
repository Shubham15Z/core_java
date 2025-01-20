/*
21.
A A A A A
 B B B B
  C C C
   B B
    A
*/

public class Question21
{
	public static void main(String arg[])
	{
		char ch = 'A';
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
			System.out.println();
			if(i<3)
			{
				ch++;
			}
			else
			{
				ch--;
			}				
		}
	}
}