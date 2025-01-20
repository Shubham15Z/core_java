public class Pattern1
{
	public static void main(String arg[])
	{
		
		for(int i = 1; i <= 5; i++)
		{
			char ch = 'A';
			for(int j = 1; j<=5; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}