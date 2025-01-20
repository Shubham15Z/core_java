public class Question4
{
	public static void main(String arg[])
	{
		char ch = 'E';
		for(int i = 1; i <= 5; i++)
		{
			
			for(int j = 1; j <= i; j++)
			{
				System.out.print(ch+" ");
					
			}
			ch--;
			System.out.println();
		}
	}
}