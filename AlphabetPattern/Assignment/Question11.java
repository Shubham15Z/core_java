/*
11.

EDCBA
FEDC
GFE
HG
I

*/

public class Question11
{
	public static void main(String arg[])
	{
		char ch = 'E';
		for(int i = 1; i <= 5; i++)
		{
			char ch1 = ch;
			for(int j = 5; j >= i; j--)
			{
				System.out.print(ch1+" ");
				ch1--;	
			}
			ch++;
			System.out.println();
		}
	}
}