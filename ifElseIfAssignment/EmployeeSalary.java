import java.util.Scanner;

public class DiscountPercentage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Purchase Amounnt: ");
		int n1 = sc.nextInt();

		if(n1 > 500)
		{
			System.out.println("Discount is 15%");
		}
		else if(n1 >= 100 && n1 <= 500)
		{
			System.out.println("Discount is 10%");
		}
		else if(n1 < 100)
		{
			System.out.println("Discount is 5%");
		}
	}
}