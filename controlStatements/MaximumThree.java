import java.util.Scanner;

public class MaximumThree
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number n2: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the 3rd number n3: ");
		int n3 = sc.nextInt();

		if(n1>n2 && n1>n3)
		{
			System.out.println("The maximum between three number is: "+n1);
		}
		else if(n2>n3)
		{
			System.out.println("The maximum between three number is: "+n2);
		}
		else
		{
			System.out.println("The maximum between three number is: "+n3);
		}
	}
}