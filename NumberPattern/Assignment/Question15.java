/*
Q15
 1
 2  3
 4  5  6
 7  8  9  10
 11 12 13 14 15

*/

public class Question15
{
	public static void main(String arg[])
	{
		int n = 1;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j<= i; j++)
			{
				System.out.print(n+" ");
				n = n + 1;
			}
			System.out.println();
		}
	}
}