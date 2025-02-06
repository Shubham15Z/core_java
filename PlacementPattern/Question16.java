/*
16. Print a right-angled triangle with numbers and stars at the edges.

1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/

public class Question16
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 9; i+=2)
		{
			int n = 1;
			for(int j = 1; j <= i; j++)
			{
				if(j%2 != 0)
				{
					System.out.print(n);
					n++;
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}