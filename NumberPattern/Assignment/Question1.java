/*

Q1

5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

*/

public class Question1
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= 1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}