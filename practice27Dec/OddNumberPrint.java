import java.util.Scanner;

public class OddNumberPrint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1 = sc.nextInt();
		int rem = 0;
		System.out.println("The odd numbers from above number are:");
		while(n1!=0)
		{
			rem = n1 % 10;
			if(rem % 2 != 0)
			{
				System.out.println(rem);
			}
			
			n1 = n1/10;
		}
	}
}