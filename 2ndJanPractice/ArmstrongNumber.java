import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 100 and 1000:");
		int n = sc.nextInt();

		int rem, sum = 0;

		for(int i = n; i > 0; i = i / 10)
		{
			rem = i % 10;
			sum = sum + rem*rem*rem;
		}
		if(sum == n)
		{
			System.out.println("The number is Armstrong Number..");
		}
		else
		{
			System.out.println("The number is not Armstrong number");
		}
	}
}