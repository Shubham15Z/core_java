import java.util.Scanner;

public class PallindromeNumber
{
	public static void main(String args[])
	{
		int rem, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int i = n;

		while(i > 0)
		{
			rem = i % 10;
			rev = rev * 10 + rem;
			i = i / 10;
		}
		System.out.println("Reverse of above number is: "+rev);
		if( rev == n)
		{
			System.out.println("Number is pallindrome...");
		}
		else
		{
			System.out.println("Number is not pallindrome.....");
		}
	}
}