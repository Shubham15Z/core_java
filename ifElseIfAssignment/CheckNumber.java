import java.util.Scanner;

public class CheckNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your a number: ");
		int n1 = sc.nextInt();

		if(n1>0)
		{
			System.out.println("Number is positive");
		}
		else if(n1<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("Number is zero 0");
		}
	}
}