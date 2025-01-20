import java.util.Scanner;


public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check as a Prime or not: ");
		int n1 = sc.nextInt();
		int i = 1;
		int count = 0;
		
		while(i<=n1)
		{
			if(n1%i == 0)
			{
				count++;
			}
			i++;
		}
		if(count == 2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}

/*

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check as a Prime or not: ");
		int n1 = sc.nextInt();
		int i = 2;
		int count = 0;
		
		while(i<n1)
		{
			if(n1%i == 0)
			{
				
			}
			i++;
		}
		if(count == 2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}

*/

