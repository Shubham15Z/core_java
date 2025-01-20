import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum = 0, rem;
 
		for(int i = n; i > 0; i = i / 10)
		{
			rem = i % 10;
			sum = sum + rem*rem*rem;
		}
		if(sum == n)
		{
			System.out.println("The number "+n+" is Armstrong number");
		}
		else
		{
			System.out.println("The number "+n+" is not Armstrong number");
		}
		
	}
}