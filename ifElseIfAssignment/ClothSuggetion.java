import java.util.Scanner;

public class ClothSuggetion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature: ");
		int n1 = sc.nextInt();

		if(n1 > 20)
		{
			System.out.println("Light Clothing");
		}
		else if(n1 >= 10 && n1 <= 20)
		{
			System.out.println("Moderate Clothing");
		}
		else if(n1 < 10)
		{
			System.out.println("Heavy Clothing");
		}
	}
}