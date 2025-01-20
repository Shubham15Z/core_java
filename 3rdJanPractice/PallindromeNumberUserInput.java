import java.util.Scanner;

public class PallindromeNumberUserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int rev = 0, rem;

		for(int i = n ; i>0; i = i/10)
		{
			rem = i % 10;
			rev = rev * 10 + rem;
		}
		if(rev == n)
		{
			System.out.println("The number is pallindrome");
		}
		else
		{
			System.out.println("The number is not pallindrome");
		}
		
	}
}