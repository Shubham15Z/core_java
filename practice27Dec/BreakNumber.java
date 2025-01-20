import java.util.Scanner;

public class BreakNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Break: ");
		int n1 = sc.nextInt();
		int rem = 0;
		int count = 0;

		while(n1!=0)
		{
			rem = n1 % 10;
			System.out.println(rem);
			n1 = n1/10;
			count++;
		}
		System.out.println("The total digits in number are: "+count);
	}
}