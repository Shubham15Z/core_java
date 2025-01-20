import java.util.Scanner;

public class ReverseDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		
		int i = n, rem, rev = 0;
		while(i > 0)
		{
			rem = i % 10;
			rev = rev * 10 + rem;
			i = i / 10;
		}
		System.out.println("The reverse is :"+rev);
		
	}
}