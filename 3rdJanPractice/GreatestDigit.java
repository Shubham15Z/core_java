import java.util.Scanner;

public class GreatestDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int rem, max=0; //567

		for(int i = n; i > 0; i = i/10)
		{
			rem = i % 10;
			if(rem > max)
			{
				max = rem;
			}	
			
		}
		System.out.println("The greatest digit is: "+max);
		
	}
}