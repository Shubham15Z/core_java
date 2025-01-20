/*

Q19
     1
    2 3
   3 4 5
  4 5 6 7
 5 6 7 8 9

*/

public class Question19
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = i; j <= 5; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++)
			{
				System.out.print((i+k)+" ");
			}
			System.out.println();
		}
	}
}