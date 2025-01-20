import java.util.Scanner;

public class LargestSmallestDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		
		int i = n, rem, max = 0, min = 9;
		System.out.println("  ");
		while(i > 0)
		{
			rem = i % 10;
			if(rem > max)
			{
				max = rem;
			}
			else if(rem < min)
			{
				min = rem;
			}
			i = i / 10;
		}
		System.out.println("Largest Digit is : "+max);
		System.out.println("Smallest digit is : "+min);
	}
}