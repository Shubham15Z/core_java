/*

1*2*3*4*5
2*3*4*5
3*4*5
4*5
5  

*/

public class Question11
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = i; j <= 5; j++)
			{
				if(j<5)
				{
					System.out.print(j+"*");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}