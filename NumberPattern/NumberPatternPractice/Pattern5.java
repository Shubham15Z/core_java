public class Pattern5
{
	public static void main(String arg[])
	{
		for(int i = 5; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();	
		}
	
		for(int i = 1; i <= 5; i++)
		{
			for(int k = i; k >= 1; k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();	
		}
	
	}
}