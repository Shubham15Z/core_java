import java.util.Scanner;

public class CheckTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st angle:");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd angle:");
		int n2 = sc.nextInt();
		System.out.println("Enter the 3rd angle:");
		int n3 = sc.nextInt();
		
		if(n1>0 && n2>0 && n3>0)
		{
			if(n1+n2+n3 == 180)
			{
				System.out.println("Triangle is valid");
			}
			else
			{
				System.out.println("Triangle is not valid");
			}
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
	}
}