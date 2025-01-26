/*

5*4*3*2*1
  4*3*2*1
    3*2*1
      2*1
        1

*/

public class Question9
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 1; i--)
		{
			for(int k = 5; k >= i; k--)
			{
				System.out.print("  ");
			}
			for(int j = i; j >= 1; j--)
			{
				if(j>1)
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