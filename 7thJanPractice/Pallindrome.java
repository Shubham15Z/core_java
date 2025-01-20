import java.util.Scanner;

public class Pallindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int rem, rev = 0; 

		for(int i = n; i > 0; i = i / 10)
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