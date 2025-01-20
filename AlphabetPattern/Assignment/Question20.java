/*
20.
A B C D E
 A B C D
  A B C
   A B
    A
*/

public class Question20
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			char ch = 'A';
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}