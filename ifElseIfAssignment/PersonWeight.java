import java.util.Scanner;

public class PersonWeight
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight:");
		int n1 = sc.nextInt();

		if(n1 > 24.9)
		{
			System.out.println("Overweight");
		}
		else if(n1 >= 18.5 && n1 <= 24.9)
		{
			System.out.println("Normal");
		}
		else if(n1 < 22)
		{
			System.out.println("Underweight");
		}
	}
}