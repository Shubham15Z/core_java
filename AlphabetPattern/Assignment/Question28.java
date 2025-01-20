/*

28.  
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
*/

public class Question28
{
	public static void main(String arg[])
	{
		char ch = 'A';
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print(ch);
				
			}
			for(int l = 2; l <= i; l++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
}