/*
27.
E D C B A
 D C B A
  C B A
   B A
    A
*/

public class Question27
{
	public static void main(String arg[])
	{
		char ch = 'E';
		for(int i = 1; i <= 5; i++)
		{
			char ch1 = ch;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				System.out.print(ch1+" ");
				ch1--;
			}
			ch--;
			System.out.println();
		}
	}
}