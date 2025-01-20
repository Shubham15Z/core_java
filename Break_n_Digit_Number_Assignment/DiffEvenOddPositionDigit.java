import java.util.Scanner;

public class DiffEvenOddPositionDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		
		int i = n, rem, evenSum = 0, oddSum = 0, count = 1;
		while(i > 0)
		{
			rem = i % 10;
			if(count % 2 == 0)
			{
				evenSum = evenSum + rem;
			}
			else
			{
				oddSum = oddSum + rem;
			}
			i = i / 10;
			count++;
		}
		System.out.println("Even position sum is : "+evenSum);
		System.out.println("Odd position sum is : "+oddSum);
		System.out.println("Difference of sum is : "+(oddSum-evenSum));
	}
}


// 345

/*
 345 % 10 = 5
*/