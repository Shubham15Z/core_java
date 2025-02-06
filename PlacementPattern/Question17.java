/*
17. Print a right-angled triangle with numbers and stars inside.

1
2*3
4*5*6
7*8*9*10
*/

public class Question17
{
	public static void main(String arg[])
	{	
		int n = 1;
		for(int i = 1; i <= 7; i+=2)
		{
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