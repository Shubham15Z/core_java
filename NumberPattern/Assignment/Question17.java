/*

Q17

15
14 13
12 11 10
9  8  7  6
5  4  3  2  1

*/

public class Question17
{
	public static void main(String arg[])
	{
		int n = 15;
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 1; k <= i; k++)
			{
				System.out.print(n+" ");
				n = n - 1;
			}
			System.out.println();
		}
	}
}