public class FindPallindrome
{
	public static void main(String args[])
	{
		
		for(int i = 10; i<=150; i++)
		{
			int rem, rev = 0;
			for(int j = i; j>0; j=j/10)
			{
				rem = j % 10;
				rev = rev * 10 + rem;
				
			}
			if(rev == i)
			{
				System.out.print(i+ " ");
			}
			
		}
	}
}



//10 to 100