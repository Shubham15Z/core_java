/*

1*2*3*4*5
1     4
1   3
1 2
1


*/

public class Question12SecondWay
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == 5 && j == 1)
				{
					System.out.print(j+"*");
				}
				else if(j == i || (j==1 && i != 1))
				{
					System.out.print(j+" ");
				}
				else if(j == 1 || i == 5 || j==i)
				{
					System.out.print(j+"*");
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