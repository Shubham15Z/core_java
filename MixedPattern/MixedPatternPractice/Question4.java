/*

1*2*3*4*5
1*2*3*4
1*2*3
1*2
1


*/

public class Question4
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j<i)
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