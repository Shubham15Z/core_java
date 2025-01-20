import java.util.Scanner;

public class SumOfDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		
		int i = n, rem, sum = 0;
		System.out.println("  ");
		while(i > 0)
		{
			rem = i % 10;
			sum = sum + rem;
			i = i / 10;
		}
		System.out.println("Sum of digits is : "+sum);
	}
}