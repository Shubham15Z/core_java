public class Pattern15
{
	public static void main(String arg[])
	{
		
		for(int i = 5; i >= 1; i--)
		{	
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();	
		}
	}
}