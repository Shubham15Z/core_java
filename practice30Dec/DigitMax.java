public class DigitMax
{
	public static void main(String args[])
	{
		int no = 73956, rem = 0, max = 0, secMax = 0;
		
		while(no != 0)
		{
			rem = no % 10;
			if(rem > max)
			{
				max = rem;
			}
			no = no / 10;
		}
		System.out.println("Maximum digit is: "+max);
	}
}