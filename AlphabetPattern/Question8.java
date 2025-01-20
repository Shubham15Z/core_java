public class Question8
{
	public static void main(String arg[])
	{
		char ch = 'E';
		for(int i = 1; i <= 5; i++)
		{
			
			for(int j = 5; j >= i; j--)
			{
				System.out.print(ch+" ");	
			}
			ch--;
			System.out.println();
		}
	}
}