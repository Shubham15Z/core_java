/*
Q13.

A
BC
DEF
GHIJ
KLMNO
*/



public class Question13
{
	public static void main(String arg[])
	{
		char ch = 'A';
		for(int i = 1; i <= 5; i++)
		{
			
			for(int j = 1; j <= i; j++)
			{
				System.out.print(ch+" ");
				ch++;	
			}
			
			System.out.println();
		}
	}
}