import java.util.Scanner;

public class PositiveNegative
{	
	public static void main(String[] arg)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n>0)
		{
			System.out.println("The number is positive");
		}
		else if(n<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero 0");
		}
	}
}