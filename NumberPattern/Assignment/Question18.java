/*
Q18
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9

*/

public class Question18
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 0; k < i; k++)
			{
				System.out.print((i+k)+" ");
			}
			System.out.println();
		}
	}
}