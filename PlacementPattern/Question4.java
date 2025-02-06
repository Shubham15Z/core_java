/*

4. Print a diamond shape with numbers and stars.

   1
  2*3
 4*5*6
7*8*9*10
 4*5*6
  2*3
   1

*/

public class Question4
{
	public static void main(String arg[])
	{
		int n = 1;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 3; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(n);
				n++;
				if(j < i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		int m = 4;
		for(int i = 3; i > 0; i--)
		{
			for(int j = i; j <= 3; j++)
			{
				System.out.print(" ");
			}
			
			int temp = m;
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
			m = m-(i-1);
		}
		
	}
}