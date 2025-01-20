import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n1: ");
		int n1 = sc.nextInt();
		
		if(n1>=0 && n1%2 == 0)
		{
			System.out.println("The number is Even");
		}
		else if(n1<0)
		{
			System.out.println("Enter positive number");
		}
		else
		{
			System.out.println("The number is Odd");
		}
	}
}