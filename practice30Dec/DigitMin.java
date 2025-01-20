public class DigitMin
{
	public static void main(String args[])
	{
		int no = 73956, min = 9, rem = 0;
		
		while(no != 0)
		{
			rem = no%10;
			if(rem < min)
			{
				min = rem;
			}
			no = no / 10;
		} 
		System.out.println("Minimum digit is: "+min);
	}
}