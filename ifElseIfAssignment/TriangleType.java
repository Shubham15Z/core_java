import java.util.Scanner;

public class TriangleType
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st side:");
		int s1 = sc.nextInt();
		System.out.println("Enter 2nd side:");
		int s2 = sc.nextInt();
		System.out.println("Enter 3rd side:");
		int s3 = sc.nextInt();

		if(s1==s2 && s1==s3)
		{
			System.out.println("Triangle is Equilateral");
		}
		else if(s1==s2 || s1==s3 || s2==s3)
		{
			System.out.println("Triangle is isosceles");
		}
		else
		{
			System.out.println("Triangle is Scalene");
		}
	}
}