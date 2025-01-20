public class OddNumberBetween
{
	public static void main(String[] args)
	{
		
		int n1 = 200, n2 = 300;
	
		while(n1<=n2)
		{
			if(n1%2 != 0)
			{
				System.out.println(n1);	
			}
			n1++;
		}
	}	
}