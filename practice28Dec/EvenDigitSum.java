import java.util.Scanner;

public class EvenDigitSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = sc.nextInt();
		int rem = 0;
		int sum = 0;
		while(n1>0)
		{
			rem = n1%10;
			if(rem%2 == 0)
			{
				sum = sum + rem;
			}
			n1 = n1/10;
		}
		System.out.println("The sum of all even number digits is : "+sum);
	}
}
