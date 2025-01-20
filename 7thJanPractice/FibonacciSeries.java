import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1;
		System.out.println("Fibonacci Series is: ");
		System.out.print(n1+" "+n2);

		for(int i = 1; i <=n-2; i++)
		{
			int n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		
	}
}