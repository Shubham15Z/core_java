public class ArmstrongNumber
{
	public static void main(String args[])
	{
		for(int i = 10; i < 1000; i++)
		{
			int rem, sum=0;
			for(int j = i; j > 0; j = j / 10)
			{
				rem = j % 10;
				sum = sum + rem*rem*rem;
			}
			if(sum == i)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
