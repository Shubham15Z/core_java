import java.util.Scanner;

public class ArmstrongNumberUserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number: ");
		int n = sc.nextInt();
		int sum = 0, rem;

		for(int i = n ; i>0; i = i/10)
		{
			rem = i % 10;
			sum = sum + rem*rem*rem;
		}
		if(sum == n)
		{
			System.out.println("The number is Armstrong number");
		}
		else
		{
			System.out.println("The number is not Armstrong number");
		}
		
	}
}