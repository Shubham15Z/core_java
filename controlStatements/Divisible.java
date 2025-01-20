import java.util.Scanner;

public class Divisible
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n1: ");
		int n1 = sc.nextInt();
		
		if((n1%5) == 0 && (n1%11) == 0)
		{
			System.out.println("The number is divisible by both 5 and 11");
		}
		else if((n1%5) == 0)
		{
			System.out.println("The number is divisible by 5");
		}
		else if((n1%11) == 0)
		{
			System.out.println("The number is divisible by 11");
		}
		else
		{
			System.out.println("The number is not divisible by both");
		}
	}
}