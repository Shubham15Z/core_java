import java.util.Scanner;

public class Maximum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number n2: ");
		int n2 = sc.nextInt();

		if(n1>n2)
		{
			System.out.println("The maximum between two number is: "+n1);
		}
		else
		{
			System.out.println("The maximum between two number is: "+n2);
		}
	}
}