/*
Q20

9
8 7
7 6 5
6 5 4 3
5 4 3 2 1

*/

public class Question20
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print((10-i-j)+" ");
			}
			System.out.println();
		}
	}
}