import java.util.Scanner;

public class EvenDigitCountSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number at least 6 digit:");
		int n = sc.nextInt();
		int count = 0, sum = 0, rem;

		for(int i = n; i > 0; i = i/10)
		{
			rem = i % 10;
			if(rem % 2 == 0)
			{
				count++;
				sum = sum + rem;
			}
		}
		System.out.println("The count of even digits is: "+count);
		System.out.println("The Sum of even digits is: "+sum);
		
	}
}