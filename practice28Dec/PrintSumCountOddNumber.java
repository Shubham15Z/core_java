import java.util.Scanner;

public class PrintSumCountOddNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = sc.nextInt();
		int sum = 0;
		int count = 0;

		System.out.println("All odd numbers between "+n1+" and "+n2+" are:");
		while(n1<=n2)
		{
			if(n1%2 != 0)
			{
				System.out.print(n1+", ");
				sum = sum + n1;
				count++;
			}
			n1++;
		}
		System.out.println("");
		System.out.println("Sum of all odd numbers is: "+sum);
		System.out.println("Total count of odd numbers is: "+count);
	}	
}