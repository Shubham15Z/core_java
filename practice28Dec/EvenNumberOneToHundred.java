public class EvenNumberOneToHundred
{
	public static void main(String[] args)
	{
		int i = 1;
		System.out.println("Event numbers from one to Hundred are: ");
		
		while(i<=100)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}