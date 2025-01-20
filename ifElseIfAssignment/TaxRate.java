import java.util.Scanner;

public class TaxRate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Income: ");
		int n1 = sc.nextInt();

		if(n1 > 100000)
		{
			System.out.println("Tax rate is 25%");
		}
		else if(n1 >= 50000 && n1 <= 100000)
		{
			System.out.println("Tax rate is 20%");
		}
		else if(n1 < 50000)
		{
			System.out.println("Tax rate is 15%");
		}
	}
}