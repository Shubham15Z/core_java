/*
6. Print an inverted pyramid with alternating numbers and stars.

7*8*9*10
  4*5*6
   2*3
    1
*/

public class Question6
{
	public static void main(String arg[])
	{
		int num = 7;
		for(int i = 4; i > 0; i--)
		{
			for(int j = i; j < 4; j++)
			{
				System.out.print(" ");
			}

			int temp = num;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(temp);
				temp++;
				if(j < i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
			num = num-(i-1);
		}
		
	}
}