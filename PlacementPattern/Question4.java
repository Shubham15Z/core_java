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
		for(int i = 1; i <= 7; i+=2)
		{
			for(int j = 5; j >= i; j-=2)
			{
				System.out.print(" ");
			}
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
		
		int m = 4;
		for(int i = 3; i >= 1; i--)
		{
			for(int j = )
		}
		
	}
}