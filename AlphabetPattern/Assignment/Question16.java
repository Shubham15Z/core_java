/*

16.
    A
   B A
  C B A
 D C B A
E D C B A

*/

public class Question16
{
	public static void main(String arg[])
	{
		char ch = 'A';
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
				ch1--;
			}
			ch++;
			System.out.println();
		}
	}
}