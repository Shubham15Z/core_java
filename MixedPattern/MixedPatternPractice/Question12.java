/*

1*2*3*4*5
1     4
1   3
1 2
1


*/

public class Question12
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			if(i<5)
			{
				System.out.print(i+"*");			
			}
			else
			{
				System.out.print(i);
			}
		}
		System.out.println();
		
		for(int i = 1; i <= 4; i++)
		{
			for(int j = i; j <= 4; j++)
			{
				if(j == 4 || j == 1 || i == j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}