public class Question10
{
	public static void main(String arg[])
	{
		char ch = 'E';
		for(int i = 1; i <= 5; i++)
		{
			char ch1 = ch;
			for(int j = 5; j >= i; j--)
			{
				System.out.print(ch1+" ");
				ch1--;	
			}
			ch--;
			System.out.println();
		}
	}
}