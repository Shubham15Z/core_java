/*
Q3

5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1

*/

public class Question3
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j<= 5; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}