/*


% % % % % %
 & & & & &
  % % % %
   & & &
    % %
     &

*/

public class Question8
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 6; i++)
		{
			for(int k = 1; k <= i; k++)
			{
				System.out.print(" ");
			}
			for(int j = i; j <= 6; j++)
			{
				if(i % 2 == 1)
				{
					System.out.print("% ");
				}
				else
				{
					System.out.print("& ");
				}
			}
			System.out.println();
		}
	}
}