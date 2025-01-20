public class DigitMaxSecmax
{
	public static void main(String args[])
	{
		int no = 73956, rem = 0, max = 0, secMax = 0;
		
		while(no != 0)
		{
			rem = no % 10; // 73956%10 = 6, 7395%10 = 5, 739%10 = 9, 73%10 = 3, 7%10 = 7
			if(rem > max)  // 6 > 0, 5>6, 9>6, 3>9, 7>9
			{
				secMax = max; // 6
				max = rem; // 6, 9
			}
			else if(rem > secMax && rem != max) //3 > 6, 7>6
			{
				secMax = rem; //5, 7
			}
			no = no / 10;  // 7395, 739, 73,7
		}
		System.out.println("Maximum digit is: "+max);
		System.out.println("Second maximum digit is: "+secMax);
	}
}